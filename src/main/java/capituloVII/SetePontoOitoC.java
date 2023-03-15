/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capituloVII;

public class SetePontoOitoC {
    //c
    private static final double[] c = new double[100];
    private static double total = 0;
    public static void main(String[] args) {
        
        for (int i = 0; i < c.length; i++) {
            c[i] = 1.0;
            total+=c[i];
        }
        System.out.println(total);
    }
}
