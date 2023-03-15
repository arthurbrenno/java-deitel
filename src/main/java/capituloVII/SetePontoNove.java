/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capituloVII;

public class SetePontoNove {
    private static int[][] t = new int[2][3];
    public static void main(String[] args) {
        for (int i = 0; i < t.length; i++) {
            for(int j = 0; j < t.length; j++) {
                t[i][j] = 1;
            }
        }

        //farei manualmente mesmo
        System.out.print(t[0][0] + " ");
        System.out.print(t[0][1] + " ");
        System.out.print(t[0][2] + " ");
        
        
        //coluna 2
        System.out.print(t[0][1] + " ");
        System.out.print(t[1][1] + " ");
    }
}
