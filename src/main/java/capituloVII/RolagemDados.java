package capituloVII;

import java.util.Random;
import java.security.SecureRandom;

public class RolagemDados {
    private static Random random = new Random();
    private static final int QUANTIDADE_DE_ROLAGENS = 36_000_000;
    private static int dadoUm;
    private static int dadoDois;
    private static int somaDosDados;
    private static int[] ocorrencias = new int[13];
    

    public static void main(String[] args) {
        for(int i = 0; i < QUANTIDADE_DE_ROLAGENS; i++) {
            dadoUm = 1 + random.nextInt(6);
            dadoDois = 1 + random.nextInt(6);
            somaDosDados = dadoUm + dadoDois;
            ocorrencias[somaDosDados]++;
        }
        System.out.println("=-=-= Somas =-=-=");
        for (int i = 2; i < ocorrencias.length; i++) {
            System.out.printf("%5d => %5d%n", i, ocorrencias[i]);
        }
        calcularPorcentagem(ocorrencias);
    }

    private static void calcularPorcentagem(int[] dados) {
        int soma = 0;
        for (int dado : dados) {
            soma += dado;
        }
        System.out.println("=-=-= Porcentagens =-=-=");
        String[] porcentagens = new String[dados.length];
        for (int i = 0; i < dados.length; i++) {
            porcentagens[i] = String.format("%5d = %.2f%%", i, ((double)dados[i]/soma) * 100);
        }
        for (String porcentagem : porcentagens) {
            System.out.println(porcentagem);
        }
    }
}
