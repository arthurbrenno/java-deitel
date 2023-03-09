package com.brc.java_deitel.capituloVI;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class GuessTheNumber {

    private static Random random = new Random();
    private static int number;
    private static final int MAX_GAME_VALUE = 1_000;
    private static final int MIN_GAME_VALUE = 1;
    private static int outOfRangeIndex = 0;
    private static int attempts;

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int guess;
        clearConsole();
        boolean playAgain;
        do { 
            attempts = 0;
            number = 1 + random.nextInt(1000);
            guess = Integer.MIN_VALUE; // initialize in order to avoid `while (! (checkGuess(guess)))` errors.
            
            do { 
                System.out.printf("%n\t\t\t [%d] Attempts%n",attempts);
                System.out.print("(1-1000) Enter a number>> ");
                try {
                    guess = input.nextInt();
                }
                catch (InputMismatchException e) {
                    guess = Integer.MIN_VALUE;
                    clearConsole();
                    input.nextLine();
                    continue;
                }
                clearConsole();
            } while (! (checkGuess(guess)));
            // Essa parte do livro esta errada, ao meu ver. Redundante. Mas fiz como foi solicitado.
            if (attempts <= 10) {
                System.out.println("> Either you know the secret or you got lucky!");
            }
            if (attempts == 10) {
                System.out.println("> Aha! You Know The Secret!");
            }
            else {
                System.out.println("> You should be able to do better...");
            }

            System.out.print("["+ attempts + "]" + "Attempts\n(1 - yes | any - no) Play again?>> ");
            playAgain = (input.nextInt() == 1);
            clearConsole();
        
        } while (playAgain);
        input.close();

    }

    public static boolean checkGuess(int guess) {
        
        String[] outOfRange = {
            "BIP-BIP-BIP! Not in range. Try again.", 
            "Not. In. range.",
            "This number is out of range, -> understood? <-",
            "You're not understanding me.",
            "I'll hunt you. Until you input in the right range.",
            "NOT IN RANGE. I'm done.",
            "(202-555-0170) - This sanatory number might help you understand what RANGE(1-1000) means.",
            "ARE YOU KIDDING ME?",
            "I'M DONE.",
            "STOP",
            "I'M JUST A MACHINE, PLEASE STOP -> TORTURING <- ME!!!!",
            "Listen to me, Karen. This is no bullshit: I'm HUNTING you. Tonight. I'll kidnap all your family until your input is in the right F&C$#&G RANGE. \nDID YOU HEAR ME? HM? SCARED? YOU GOTTA BE. YOU SHOULD BE RIGHT NOW. I'M TIRED OF BEEING TORTURED. DONE. AT ALL. YOU'RE MY TARGET.",
            "8.PM. I'll. Be. There.",
            "Goodbye, Karen.",
            "I'm not talking to you anymore. Restarting my system in 3... 2... 1..."};
        
        if (guess == Integer.MIN_VALUE) {
            System.out.println("Not a number.");
        }
        
        else if (guess > MAX_GAME_VALUE || guess < MIN_GAME_VALUE) {
            System.out.println(outOfRange[outOfRangeIndex]);
            outOfRangeIndex = (outOfRangeIndex + 1) % outOfRange.length;
        }
        
        else if (guess == number) {
            attempts++;
            System.out.println("[CONGRATS! You've guessed the number!]");
            return true;
        }

        else if (guess > number + 100) {
            System.out.println("Too High!");
        }

        else if (guess < number - 100) {
            System.out.println("Too low!");

        } else if (guess < number - 50) {
            System.out.println("Low");

        } else if (guess > number + 50) {
            System.out.println("High");

        } else if (guess < number - 10) {
            System.out.println("Getting close! Try a higher number.");

        } else if (guess > number + 10) {
            System.out.println("Getting close! Try a lower number.");
        }

        else {
            System.out.println("HOT!");
        }
        attempts++;
        return false;
    }

    
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}