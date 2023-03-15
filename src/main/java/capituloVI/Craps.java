package capituloVI;
// Fig. 6.9: Craps.java.
// A classe Craps simula o jogo de dados craps.
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class Craps {

   public static void main(String[] args) {
      clearConsole();
      Scanner scanner = new Scanner(System.in);
      Craps craps = new Craps();
      double wager = -1;
      while (craps.getBankBalance() > 0) {

         do {
            try {
               System.out.printf("Balance US$%.2f%n", craps.getBankBalance());
               System.out.print("Wager>> ");
               wager = Double.parseDouble(scanner.next());
            }
            catch (InputMismatchException | NumberFormatException e) {
               clearConsole();
               wager = -1;
               System.out.println("Not a valid wager. Check your input.");
               continue;
            }
            System.out.printf((wager <= 0) ? "You must enter a wager.%n"
                  : (wager > craps.getBankBalance()) ? "You're currently not that rich!%n" : "");
         } while ((wager > craps.getBankBalance()) ^ (wager <= 0));

         clearConsole();

         Status round = craps.play();
         previousDistance = craps.getBankBalance();
         
         if (round == Status.LOST) {
            craps.subBankBalance(wager);
         } 
         else {
            craps.addBankBalance(wager);
         }
         
         if (craps.getBankBalance() > 0) {
            System.out.println(randomMessage(craps.getBankBalance()));
         }
         else {
            System.out.println("Sorry, you're broke. Goodbye.");
         }

      }
      scanner.close();
   }

   private static double previousDistance; // variável utilizada no método randomMessage

   // cria um gerador de números aleatórios para uso no método rollDice
   private SecureRandom randomNumbers = new SecureRandom();

   // enumeração com constantes que representam o status do jogo
   private enum Status {
      CONTINUE, WON, LOST
   };

   private double bankBalance = 1_000;

   // constantes que representam lançamentos comuns dos dados
   private final static int SNAKE_EYES = 2;
   private final static int TREY = 3;
   private final static int SEVEN = 7;
   private final static int YO_LEVEN = 11;
   private final static int BOX_CARS = 12;

   // joga uma partida de craps
   public Status play() {
      int myPoint = 0; // pontos se não ganhar ou perder na 1a. rolagem
      Status gameStatus; // pode conter CONTINUE, WON ou LOST

      int sumOfDice = rollDice(); // primeira rolagem dos dados

      // determina o status do jogo e a pontuação com base no primeiro lançamento
      switch (sumOfDice) {
         case SEVEN: // ganha com 7 no primeiro lançamento
         case YO_LEVEN: // ganha com 11 no primeiro lançamento
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: // perde com 2 no primeiro lançamento
         case TREY: // perde com 3 no primeiro lançamento
         case BOX_CARS: // perde com 12 no primeiro lançamento
            gameStatus = Status.LOST;
            break;
         default: // não ganhou nem perdeu, portanto registra a pontuação
            gameStatus = Status.CONTINUE; // jogo não terminou
            myPoint = sumOfDice; // informa a pontuação
            System.out.printf("Point is %d\n", myPoint);
            break; // opcional no final do switch
      } // switch final

      // enquanto o jogo não estiver completo
      while (gameStatus == Status.CONTINUE) // nem WON nem LOST
      {
         sumOfDice = rollDice(); // lança os dados novamente

         // determina o status do jogo
         if (sumOfDice == myPoint) // vitória por pontuação
            gameStatus = Status.WON;
         else if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontuação
            gameStatus = Status.LOST;
      } // fim do while

      // exibe uma mensagem ganhou ou perdeu
      if (gameStatus == Status.WON)
         System.out.println("Player wins");
      else
         System.out.println("Player loses");

      return gameStatus;
   } // fim do método play

   // lança os dados, calcula a soma e exibe os resultados
   public int rollDice() {
      // seleciona valores aleatórios do dado
      int die1 = 1 + randomNumbers.nextInt(6); // primeiro lançamento do dado
      int die2 = 1 + randomNumbers.nextInt(6); // segundo lançamento do dado

      int sum = die1 + die2; // soma dos valores dos dados

      // exibe os resultados desse lançamento
      System.out.printf("Player rolled %d + %d = %d\n",
            die1, die2, sum);

      return sum; // retorna a soma dos dados
   } // fim do método rollDice

   private static String randomMessage(double bankBalance) {

      Random random = new Random();
      String[] message;

      if (bankBalance < 300) {
         if (bankBalance > previousDistance) {

            message = new String[] { "Almost there, big boy!",
                  "HIGHER!",
                  "You CAN do this!",
                  "What about trying a higher amount? hahaha",
                  "On. Fire!" };
         } else {
            message = new String[] { "Oh, you're going for broke, huh?",
                  "Double the bet, trust me.",
                  "You need to get out of this...",
                  "Your momma isn't proud.",
                  "Nothing to see here, just you getting broke..." };
         }
      }

      else if (bankBalance > 5000) {
         if (bankBalance > previousDistance) {
            message = new String[] { "You should stop... So much money...",
                  "MORE MORE MORE MORE",
                  "Hello, Tony Stark.",
                  "Bill Gates better not find this money.",
                  "Ever thought buying a Tesla?" };
         } else {
            message = new String[] { "Aw, come on! Take a chance!",
                  "Dont. Start. Losing. The. money.",
                  "You're up big. Now's the time to cash in your chance!",
                  "Have you watched Puss In Boots 2? Great Movie. BTW, you lost money.",
                  "MCU 5 really sucks. You lost money again." };
         }
      } 
      
      else {
         if (bankBalance > previousDistance) {
            message = new String[] {
                  "You're on fire! Keep it up!",
                  "Ka-ching! Money bags!",
                  "Wow, you're a regular high roller!",
                  "Money, money, money! Who needs anything else?",
                  "You're crushing it! Keep those wins coming!" };
         } else {
            message = new String[] {
                  "Don't worry, you'll win it back!",
                  "It's just a minor setback. Keep playing!",
                  "You win some, you lose some. Keep your head up!",
                  "Time to regroup and go back in stronger!",
                  "You may have lost some money, but you're still a winner in our eyes!"
            };
         }
      }
      return message[random.nextInt(5)];
   }

   public double getBankBalance() {
      return this.bankBalance;
   }

   public void setBankBalance(double bankBalance) {
      this.bankBalance = bankBalance;
   }

   public void subBankBalance(double subtraction) {
      this.bankBalance -= subtraction;
   }

   public void addBankBalance(double addNumber) {
      this.bankBalance += addNumber;
   }

   public static void clearConsole() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

} // fim da classe Craps