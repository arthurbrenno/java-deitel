package capituloVII;

import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello!");
        int number = scanner.nextInt();
        System.out.println(number);
        scanner.close();
    }
}