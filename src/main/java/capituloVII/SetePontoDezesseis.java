package capituloVII;

public class SetePontoDezesseis {
    public static void main(String[] args) {
        double total = 0;
        for (String n : args) {
            total += Double.parseDouble(n);
        }
        System.out.println(total);
    }
}
