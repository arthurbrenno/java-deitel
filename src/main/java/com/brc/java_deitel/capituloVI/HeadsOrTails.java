package com.brc.java_deitel.capituloVI;
import java.security.SecureRandom;
import java.util.Scanner;

public class HeadsOrTails {

    private enum Status {
        HEADS, TAILS
    };

    private static int countHeads = 0;
    private static int countTails = 0;

    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Status gameStatus = null;
        while (true) {
            clearConsole();
            if (gameStatus != null) {
                System.out.println("Resultado>> [" + gameStatus + "]");
            }
            else {
                System.out.println("Resultado>> []");
            }
            
        
            System.out.printf("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=        
                    [%d] HEADS
                    [%d] TAILS
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                    """, countHeads, countTails);
            System.out.print("""

                            :<CARA OU COROA>:
                            [1] - Toss Coin
                            - press any character to exit

                    """);
            System.out.print("\n\n:>>");
            boolean gameCondition = (input.next().equals("1")) ? true : false;
            if (!gameCondition) {
                break;
            }
            gameStatus = flip();
            
        }
        
        input.close();

    }

    public static Status flip() {
        SecureRandom random = new SecureRandom();
        if(random.nextInt(2) == 0) {
            countHeads++;
            return Status.HEADS;
        }
        countTails++;
        return Status.TAILS;
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}