package capituloVII;

public class SetePontoQuatorze {

    public static void main(String[] args) {
        System.out.println(product(2,2,2));
    }
    
    
    public static int product(int... values) {
        int total = 1;
        for (int i = 0; i < values.length; i++) {
            total *= values[i];
        }
        return total;
    }
}