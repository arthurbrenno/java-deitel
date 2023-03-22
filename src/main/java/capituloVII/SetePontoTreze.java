package capituloVII;

public class SetePontoTreze {
    private static int[][] sales = new int[3][5];
    
    public static void main(String[] args) {
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = 0;
            }
        }
        //r:       0                1                2
        //c: 0, 1, 2, 3, 4    0, 1, 2, 3, 4    0, 1, 2, 3, 4
        // row = 0;
        // {{x, x, x, x, x}, {x, x, x, x, x}, {x, x, x, x, x}}
        // {{0, x, x, x, x}, {x, x, x, x, x}, {x, x, x, x, x}}
        // {{0, 0, x, x, x}, {x, x, x, x, x}, {x, x, x, x, x}}
        // {{0, 0, 0, x, x}, {x, x, x, x, x}, {x, x, x, x, x}}
        // {{0, 0, 0, 0, x}, {x, x, x, x, x}, {x, x, x, x, x}}
        // {{0, 0, 0, 0, 0}, {x, x, x, x, x}, {x, x, x, x, x}}
        // row = 1;
        // {{0, 0, 0, 0, 0}, {0, x, x, x, x}, {x, x, x, x, x}}
        // {{0, 0, 0, 0, 0}, {0, 0, x, x, x}, {x, x, x, x, x}}
        // {{0, 0, 0, 0, 0}, {0, 0, 0, x, x}, {x, x, x, x, x}}
        // {{0, 0, 0, 0, 0}, {0, 0, 0, 0, x}, {x, x, x, x, x}}
        // {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {x, x, x, x, x}}
        // row = 2;
        // {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, x, x, x, x}}
        // {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, x, x, x}}
        // {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, x, x}}
        // {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, x}}
        // {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}}


    }
}