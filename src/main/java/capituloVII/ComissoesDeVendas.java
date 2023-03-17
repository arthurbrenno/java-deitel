package capituloVII;

import java.util.Scanner;

public class ComissoesDeVendas {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    private static boolean estaCheio(int[] intervalo) {
        for (int element : intervalo) {
            if (element == 0) {return false;}
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] intervalos = new int[11];
        int salario;
        int contador = 1;
        do {
            System.out.printf("Salario %d: ", contador++);
            salario = (int) scanner.nextDouble();
            if (salario >= 1000) {
                intervalos[10]++;
            }
            else {
                intervalos[(salario / 100)]++;
            }
        } while (!estaCheio(intervalos) && salario != -1);
        for (int i = 2; i < 10; i++) {
            System.out.printf("%d - %d: %d%n", i*100, ((i+1)*100)-1, intervalos[i]);
        }
    }

}
