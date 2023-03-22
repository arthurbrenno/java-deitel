package capituloVII;

public class SetePontoQuinze {
    private static int[] array;
    public static void main(String[] args) {
        if (args.length > 0) {
            array = new int[Integer.parseInt(args[0])];
        } 
        else {
            array = new int[10];
        }
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%d - %d%n", counter, array[counter]);
        }
    }
}
