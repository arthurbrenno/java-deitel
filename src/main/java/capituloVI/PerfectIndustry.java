
package capituloVI;
//Verificador de números perfeitos

public class PerfectIndustry {

    public static void main(String[] args) {
        int perfectNumbersFound = 0;
        for (int i = 1; i <= 999999999; i++) {
            boolean isPerfecto = isPerfect(i);
            System.out.printf("[%d]   %d>> %b%n", perfectNumbersFound, i, isPerfecto);
            if (isPerfecto) {
                perfectNumbersFound++;
            }
        }
    }

    public static boolean isPerfect(int number) {
        if (number == 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

}