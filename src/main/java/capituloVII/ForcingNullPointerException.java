/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capituloVII;

//forcando um NullPointerException
public class ForcingNullPointerException {
    private static final int ARRAY_SIZE = 10;
    
    
    public static void main(String[] args) {
        String[] myArray = new String[ARRAY_SIZE];
        myArray[9] = "1.667";
        double total = 0;
        for (String x : myArray) {
            total += Double.parseDouble(x);
        }
        System.out.println(total);
    }
}
