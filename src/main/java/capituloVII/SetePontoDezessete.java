package capituloVII;

import java.util.Arrays;
import java.util.Random;

public class SetePontoDezessete {
    private static final Random random = new Random();
    private static int[] aparicoes = new int[11];
    private static final int QUANTIDADE_DE_ROLAGENS = 36_000_000;
    public static void main(String[] args) {
        int primeiroDado;
        int segundoDado;
        int somaDosDados;

        for (int i = 0; i < QUANTIDADE_DE_ROLAGENS; i++) {
            primeiroDado = 1 + random.nextInt(6);
            segundoDado = 1 + random.nextInt(6);
            somaDosDados = primeiroDado + segundoDado;
            aparicoes[somaDosDados - 2]++;
        }
        
    }
}