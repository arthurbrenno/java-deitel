package capituloVII;

import java.util.Arrays;
import java.util.Scanner;

public class SetePontoDoze {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int NUMBERS_TO_READ = 5;
    private static int[] array = new int[NUMBERS_TO_READ + 5];

    public static void main(String[] args) {
        clear();
        for(int i = 0; i < NUMBERS_TO_READ; i++) {
            System.out.println(Arrays.toString(array));
            System.out.print("Number>> ");
            int inputNumber = validadeUserInput();
            clear();
            array[i] = inputNumber;
        }
        for (int i = 0; i < array.length; i++) {
            if (isUnique(array[i]) && array[i] != -1) {
                array[i+5] = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Números únicos:");
        for (int i = 5; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println(array[i]);
            }
        }
    }

    private static boolean isUnique(int number) {
        int times = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                times++;
            }
            if (times > 1) {
                return false;
            }
        }
        return true;
    }

    private static int validadeUserInput() {
        int number = scanner.nextInt();
        return (number >= 10 && number <= 100) ? number : -1;
    }

    private static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}