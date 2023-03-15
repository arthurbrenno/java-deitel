package capituloVI;
import java.util.Scanner;
import java.util.Random;

public class AdivinheONumero {

    private static Random random = new Random();
    private static int number = 1 + random.nextInt(1000);

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int guess;
        clearConsole();
        boolean playAgain;
        do {
            do { 
                System.out.println("Number>> " + number);
                System.out.print("(1-1000) Enter a number>> ");
                guess = input.nextInt();
                clearConsole();
            } while (! (checkGuess(guess)));
            System.out.print("(1 - yes | any - no) Play again?>> ");
            playAgain = (input.next().equals("1") ? true : false);
        } while (playAgain);
        input.close();

    }

    public static boolean checkGuess(int guess) {
        if (guess == number) {
            System.out.println("You've guessed the number!");
            return true;
        }

        else if (guess > number + 100) {
            System.out.println("Too High!");
            return false;
        }

        else if (guess < number - 100) {
            System.out.println("Too low!");
            return false;
        } else if (guess < number - 50) {
            System.out.println("Low");
            return false;
        } else if (guess > number + 50) {
            System.out.println("High");
            return false;
        } else if (guess < number - 10) {
            System.out.println("Getting close! Try a higher number.");
            return false;
        } else if (guess > number + 10) {
            System.out.println("Getting close! Try a lower number.");
            return false;
        } else if (guess < number + 10 && guess > number - 10) {
            System.out.println("HOT!");
            return false;
        }
        return false;
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}