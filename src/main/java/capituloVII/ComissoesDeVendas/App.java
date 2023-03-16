package capituloVII.ComissoesDeVendas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    
    private static boolean estaCheio(int[] intervalo) {
        for (int element : intervalo) {
            if (element == 0) {return false;}
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] intervalos = new int[11];
        
        int i = 1;
        //substituir por do-while depois
        while (!estaCheio(intervalos)) {
            System.out.printf("Salario %d: ", i++);
            int salario = (int) scanner.nextDouble();
            if (salario == -1) { break; }
            intervalos[salario / 100]++;
        }
        System.out.println(Arrays.toString(intervalos));
    }

}
