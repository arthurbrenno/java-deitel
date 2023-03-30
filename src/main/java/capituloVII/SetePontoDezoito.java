package capituloVII;
//executar jogo craps 1_000_000 vezes

import java.util.Arrays;

import capituloVI.Craps;

public class SetePontoDezoito {
    private static int[] contadorVitorias = new int[21];
    private static int[] contadorDerrotas = new int[21];
    private static int somaVitorias = 0; 
    private static int somaDerrotas = 0; 
    private static Craps craps = new Craps();
    private static int NUMERO_DE_RODADAS = 1_000_000;

    //este, e apenas este, está incompleto
    public static void main(String[] args) {
        for (int i = 0; i < NUMERO_DE_RODADAS; i++) {
            craps.play();
            if (craps.rollCount < 21 && craps.lostCount < 21) {
                contadorVitorias[craps.rollCount]++;
                contadorDerrotas[craps.lostCount]++;
            }
            else {
                contadorVitorias[20]++;
                contadorDerrotas[20]++;
            }
            
        }
        
        System.out.println(Arrays.toString(contadorVitorias));
        System.out.println(Arrays.toString(contadorDerrotas));
        
        for (int element : contadorVitorias) {
            somaVitorias += element;
        }

        for (int i = 1; i < contadorDerrotas.length; i++) {
            somaDerrotas += contadorDerrotas[i];
        }

        System.out.println(somaVitorias / NUMERO_DE_RODADAS);

    }
}
