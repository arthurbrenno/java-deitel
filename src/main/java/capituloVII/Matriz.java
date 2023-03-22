package capituloVII;
//ferramenta para facilitar meus futuros trabalhos
public class Matriz {
    
    public static void paraFormatoTabular(int[][] array) {
        mostrarColunas(array);
        for (int linha = 0; linha < array.length; linha++) {
            System.out.printf("[%d] ", linha + 1);
            for (int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("  %d      ", array[linha][coluna]);
            }
            System.out.println();
        }
    }

    public static void paraFormatoTabular(int[] array) {
        mostrarColunas(array);
        System.out.print("[1]  ");
        for (int elemento : array) {
            System.out.printf("%d  ", elemento);
        }
    }

    private static void mostrarColunas(int[] array) {
        for (int col = 0; col < array.length; col++) {
            System.out.printf("    [%d] ", col + 1);
        }
        System.out.println();
    }


    private static void mostrarColunas(int[][] array) {
        for (int coluna = 0; coluna < getMaiorTamanho(array); coluna++) {
            System.out.printf("     [%d] ", coluna + 1);
        }
        System.out.println();
    }

    private static int getMaiorTamanho(int[][] array) {
        int maiorColuna = array[0].length;
        for (int i = 0; i < array.length; i++) {
            int tamanhoDaColuna = array[i].length;
            if (tamanhoDaColuna > maiorColuna) {
                maiorColuna = tamanhoDaColuna;
            }
        }
        return maiorColuna;
    }

}
