/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capituloVII;

/**
 *
 * @author User
 */
public class ExercicioSeteQuatro {
    private static final int ARRAY_SIZE = 3;
    public static void main(String[] args) {
     
        int[][] myArray = new int[ARRAY_SIZE][ARRAY_SIZE];
        for (int x = 0; x < myArray.length; x++) {
            for (int y = 0; y < myArray.length; y++) {
                myArray[x][y] = x + y;
            }
        }
        
        for(int[] linha : myArray) {
            for (int coluna : linha) {
                System.out.printf("%d ", coluna);
            }
            System.out.println();
        }
        
    }
}
