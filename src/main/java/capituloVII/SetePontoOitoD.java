/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capituloVII;

import java.security.SecureRandom;
import java.util.Arrays;

public class SetePontoOitoD {
    private static final double[] w = new double[99];
    private static final SecureRandom random = new SecureRandom();
    private static double[] menores = new double[3];
    private static double[] maiores =  new double[3];
    
    public static void main(String[] args) {
        
        for (int i = 0; i < w.length; i++) {
            w[i] = random.nextDouble(100);
        }
        
        System.out.println(Arrays.toString(w));
        
        //colocar em ordem O(n^2)
        for (int i = 0; i < w.length; i++) {
            for (int j = w.length - 1; j > i; j--) {
                double temp;
                if (w[j] > w[i]) {
                    temp = w[i];
                    w[i] = w[j];
                    w[j] = temp;
                }
            }
        }
        
        System.out.printf("Array: %s%n%n", Arrays.toString(w));
        
        
        System.out.printf("3 maiores:%n[ ");
        for (int i = 0; i < 3; i++) {
            System.out.print(w[i] + " ");
        }
        System.out.printf("]%n");
        
        System.out.printf("3 menores:%n[ ");
        for (int i = w.length - 1; i > w.length - 4; i--) {
            System.out.print(w[i] + " ");
        }
        System.out.printf("]%n");
        
        
    }
    
}
