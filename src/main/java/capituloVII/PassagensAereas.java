package capituloVII;

import java.util.Arrays;

public class PassagensAereas {
    private static final int CAPACIDADE_DE_ASSENTOS = 10;
    private static boolean[] assentos = new boolean[CAPACIDADE_DE_ASSENTOS + 1];

    public static void main(String[] args) {
        
        for (int i = 0; i < assentos.length; i++) {
            assentos[i] = false;
        }
        System.out.println(Arrays.toString(assentos));
        displayAssentos(2);

    }


    private static void displayAssentos(int classe) {
        System.out.println("Assentos:");
        for (int i = 0; i < assentos.length / 2; i++) {
            System.out.printf("   [%d]  ", i+1);
        }
        System.out.println();
        switch (classe) {
            case 1: 
                for (int i = 1; i < assentos.length / 2; i++) {
                    System.out.print("  " + assentos[i] + " ");
                } break;
            case 2:
                for (int i = assentos.length / 2; i < assentos.length - 1; i++) {
                    System.out.print("  " + assentos[i] + " ");
                } break;
            default: System.out.println("Escreva uma classe válida!");
        }
    }
}
