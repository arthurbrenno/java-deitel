package capituloVI;
// poderia utilizar StringBuilder para retornar o numero
// mas o intuito aqui era apeanas aprender a respeito da conversão..

public class NumberSystems {

    public static void toBinary(int decimal) {
        int[] binaryNumber = new int[32];
        int lastIndex = 0;
        for(int i = 0; decimal > 0; i++) {
            binaryNumber[i] = decimal % 2;
            decimal /= 2;
            lastIndex = i;
        }
        for (int j = lastIndex; j >= 0; j--) {
            System.out.print(binaryNumber[j]);
        }
    }

    public static void toOctal(int decimal) {
        int[] octalNumber = new int[11]; // 32bits Integer
        int lastIndex = 0;
        for(int i = 0; decimal > 0; i++) {
            octalNumber[i] = decimal % 8;
            decimal /= 8;
            lastIndex = i;
        }
        for (int i = lastIndex; i >= 0; i--) {
            System.out.print(octalNumber[i]);
        }
    }

    public static void toHexa(int decimal) {
        String[] hexadecimalNumber = new String[8];
        int lastIndex = 0;
        for (int i = 0; decimal > 0; i++) {
            int remainder = decimal % 16;
            if (!(remainder > 9)) {
                hexadecimalNumber[i] = Integer.toString(decimal % 16);
            }
            else {
                switch (remainder) {
                    case 10: hexadecimalNumber[i] = "A"; break;
                    case 11: hexadecimalNumber[i] = "B"; break;
                    case 12: hexadecimalNumber[i] = "C"; break;
                    case 13: hexadecimalNumber[i] = "D"; break;
                    case 14: hexadecimalNumber[i] = "E"; break;
                    case 15: hexadecimalNumber[i] = "F"; break;
                }
            }
            decimal /= 16;
            lastIndex = i;   
        }
        for (int i = lastIndex; i >= 0; i--) {
            System.out.print(hexadecimalNumber[i]);
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 256; i++) {
            System.out.printf("NUMBER: %d", i);
            System.out.print("       | B2: ");
            toBinary(i);
            System.out.print("       | B8: ");
            toOctal(i);
            System.out.print("       | B16: ");
            toHexa(i);
            System.out.println();
        }

    }

}
