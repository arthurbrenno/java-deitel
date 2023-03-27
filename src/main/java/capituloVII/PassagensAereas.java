package capituloVII;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PassagensAereas {
    private static final int CAPACIDADE_DE_ASSENTOS = 10;
    private static boolean[] assentos = new boolean[CAPACIDADE_DE_ASSENTOS + 1];
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static int classeEscolhida;

    public static void main(String[] args) {
        
        for (int i = 0; i < assentos.length; i++) {
            assentos[i] = false;
        }


        System.out.println("Please type 1 for First Class");
        System.out.println("Please type 2 for Economy");
        System.out.print(">> ");
        classeEscolhida = scanner.nextInt();
        if (!todasPoltronasDaClasseCheias()) {
            preencherAssento();
            System.out.println(Arrays.toString(assentos));
            displayAssentos();
        }
        else {
            System.out.println("As poltronas dessa classe estão cheias, deseja mudar para outra?");
            System.out.print("(s/n)>> ");
            if (scanner.next().equalsIgnoreCase("s")) {
                classeEscolhida ^= 3;
            }
            else {
                System.out.println("Next flight leaves in 3 hours.");
            }
        }

    }


    private static void displayAssentos() {
        System.out.println("Assentos:");
        for (int i = 0; i < assentos.length / 2; i++) {
            System.out.printf("   [%d]  ", i+1);
        }
        System.out.println();
        switch (classeEscolhida) {
            case 1: 
                for (int i = 1; i <= assentos.length / 2; i++) {
                    System.out.print("  " + assentos[i] + " ");
                } break;
            case 2:
                for (int i = (CAPACIDADE_DE_ASSENTOS / 2) + 1; i < assentos.length; i++) {
                    System.out.print("  " + assentos[i] + " ");
                } break;
            default: System.out.println("Escreva uma classe válida!");
        }
        System.out.println();
    }

    private static void preencherAssento() {
        assentos[getAssentoVazio()] = true;
    }

    private static int getAssentoVazio() {
        int indexVazio = 0;
        switch (classeEscolhida) {
            case 1: 
                for (int i = assentos.length / 2; i >= 0; i--) {
                    if (assentos[i] == false) {
                        indexVazio = i; break;
                    }
                } break;
            case 2:
                for (int i = assentos.length - 1; i > assentos.length / 2; i--) {
                    if (assentos[i] == false) {
                        indexVazio = i; break;
                    }
                } break;
        }
        return indexVazio;
    }

    private static boolean todasPoltronasDaClasseCheias() {
        switch (classeEscolhida) {
            case 1: 
                for (int i = 1; i <= assentos.length / 2; i++) {
                    if (assentos[i] == false) {
                        return false;
                    }
                } break;
            case 2: 
                for (int i = (CAPACIDADE_DE_ASSENTOS / 2) + 1; i < assentos.length; i++) {
                    if (assentos[i] == false) {
                        return false;
                    }
                }
        }
        return true;
    }
}
