package capituloVII;

import java.util.Scanner;

public class Tartaruga {
    private static final Scanner scanner = new Scanner(System.in);
    //move-se livremente.
    private static boolean canetaParaCima = true;
    private static boolean direita = true;
    private static int comando;
    private static final int EIXO_X = 10;
    private static final int EIXO_Y = 10;
    private static int angulo = 90;
    private static String[][] floor = new String[EIXO_X][EIXO_Y];

    public static void main(String[] args) {
        zerarMatriz();
        placeTartaruga(0, 0);
        mostrarFloor();
        placeTartaruga(1, 1);
        mostrarFloor();
    }

    private static void zerarMatriz() {
        for (int linha = 0; linha < floor.length; linha++) {
            for(int coluna = 0; coluna < floor[linha].length; coluna++) {
                floor[linha][coluna] = "0";
            }
        }
    }

    private static void mostrarFloor() {
        
        for (int linha = 0; linha < floor.length; linha++) {
            System.out.print("|  ");
            for (int coluna = 0; coluna < floor[linha].length; coluna++) {
                System.out.printf("%s  ", floor[linha][coluna]);
            }
            System.out.print("|\n");
        }
        System.out.println();
        System.out.println();
    }

    private static void placeTartaruga(int i, int j) {
        for (int linha = 0; linha < floor.length; linha++) {
            for (int coluna = 0; coluna < floor[linha].length; coluna++) {
                if (floor[linha][coluna].equals("T")) {
                    floor[linha][coluna] = "0";
                }
            }
        } 
        floor[i][j] = "T";
    }

}
