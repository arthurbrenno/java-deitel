/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capituloVII;

import java.util.Arrays;
import java.util.Scanner;

public class SetePontoNove {
    private static int[][] t = new int[2][3];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Array: ");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = i + j;
            }
            System.out.println(Arrays.toString(t[i]));
        }

        //todos elementos da linha 1
        System.out.println("Linha 1:");
        System.out.print(t[0][0] + " ");
        System.out.print(t[0][1] + " ");
        System.out.print(t[0][2] + " ");
        
        System.out.println("\n");
        //todos elementos da coluna 2
        System.out.println("Coluna 2:");
        System.out.print(t[0][1] + " ");
        System.out.print(t[1][1] + " ");
        System.out.println("\n");

        //definir elemento como zero
        t[0][1] = 0;

        //cada elemento para 0
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 0;
            }
        }
        
        //print
        for (int[] linha : t) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        //usuario insere
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("t[%d][%d] = ", i+1, j + 1);
                t[i][j] = scanner.nextInt();
            }
        }

        //printar novamente:
        System.out.println();
        for (int[] linha : t) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        //exibir o menor valor
        int menorValor = t[0][0];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                menorValor = (t[i][j] < menorValor) ? t[i][j] : menorValor;
            }
        }
        System.out.printf("Menor valor encontrado: %d%n", menorValor);

        //unico printf
        System.out.printf("Primeira Linha: %n| %d %d %d |%n", t[0][0], t[0][1], t[0][2]);

        //somar elementos da cerceira coluna
        int soma = t[0][2] + t[1][2];
        System.out.println("Soma: " + soma);

        //imprimir colunas
        for (int i = 0; i <= t.length; i++) {
            System.out.printf("   [%d] ", i+1);
        }
        System.out.println();
        //imprimir linhas e elementos
        for (int i = 0; i < t.length; i++) {
            System.out.printf("[%d] ", i+1);
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%d      ", t[i][j]);
            }
            System.out.println();
        }

    }
}
