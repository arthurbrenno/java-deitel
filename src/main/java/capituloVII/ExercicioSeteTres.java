/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capituloVII;

public class ExercicioSeteTres {
    private static final int ARRAY_SIZE = 10;
    
    
    public static void main(String[] args) {
        String[] myArray = new String[ARRAY_SIZE];
        //c) myArray[4];
        myArray[9] = "1.667";
        myArray[6] = "3.333";
        double total = 0;
        for (String x : myArray) {
            total+=Double.parseDouble(x);
        }
        System.out.println(total);
    }
}
