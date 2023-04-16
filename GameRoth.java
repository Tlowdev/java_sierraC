
/* 
Name: Tylor Roth
Date: Mar 31, 2023
Description: Guessing game
Grade: 100%
*/
import java.util.*;
public class GameRoth 
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      interact(input);
      action(input);
   }
   
   //prompt for positive number
   public static int prompt(Scanner input, String s)
   {
      int num = 0;
      System.out.print(s);
      num = input.nextInt();
      while (num < 0)
      {  
         System.out.println("invalid input");
         System.out.print(s);
         num = input.nextInt();
      }
      return num; 
   }
   //app header/intro
   public static void interact(Scanner input)
   {
      System.out.print("Hello, I am a computer playing a guessing game with you. What would you \n" +
      "like to call me? ");
      String npc = input.nextLine();
      for(int i = 1; i <= 75; i++) {
         System.out.print("-");
      } 
      System.out.println();
      System.out.println("Wow I really like the name " + npc);
      System.out.print("What is your name: ");
      String player = input.nextLine();
      System.out.print("Hey " + player + " I am excited to play the guessing game with you \n" +
      "I will think of a number between a low and a high values enerted by you \n" +
      "and will allow you to guess until you get it.\n" +
      "For each guess, I will give you a hint whether the \n" +
      "right answer is higher or lower than your guess. ");
      System.out.println();
      for(int i = 1; i <= 75; i++) {
         System.out.print("-");
      } 
      System.out.println();
   }
   //results comparing guess to random number
   public static String match(int guess, int randNum)
   {
      if (guess > randNum) 
      {
         return "Lower";
      } 
      else if(guess < randNum) 
      {
         return "Higher";
      } 
      else 
      {
         return "Match";
      }
   }
   //this method displays the final result on the screen.
   public static void report(int numGames, int totGuesses)
   {
      System.out.println("Total results: ");
      System.out.println("Total games = " + numGames);
      System.out.println("Total guesses = " + totGuesses);
   }
//generates random number and guess number
   public static int funGame(Scanner input, int min, int max)
   {   
      Random rand = new Random();
      int randNum = rand.nextInt(min, max)+ 1;
      //Guess initializer
      int userGuess = 0;
      //numGuesses initializer
      int numGuesses = 0;
      System.out.println("I am thinking of a number between " + min + " and " + max);
      System.out.println("give me a few seconds to think , then enter any key to continue");
      //while the user's guess does not equal the computer pick
      while (userGuess != randNum)
      {
         numGuesses++;
         System.out.print("Guess? ");
         userGuess = input.nextInt();
         //call match method to retrieve results
         String result = match(userGuess, randNum);
         if (result == "Match")
         {
            System.out.println("CONGRATULATIONS! You got it right in " + numGuesses + " guesses!");
         }
         else 
         {
            System.out.print(result + "\n");
         }
      }//end of while loop
      System.out.println();
      return numGuesses;
   }

   public static void action(Scanner input)
   {
      int numGames = 0; // total number of the games played by the person
      int totGuesses = 0; // total guesses for all the games played
      String repeat = "yes" ;
      while (repeat.equalsIgnoreCase("yes")) {
      String s = "Enter a low value: ";
      String s1 = "Enter the high value: ";
      //checks if number are valid
      int min = prompt(input, s);
      int max = prompt(input, s1);
      while (max <= min) //invalid number
      {
         System.out.println("You entered an invalid value for max. Max must be \n" +
         "greater than min. lets start all over again\n");
          min = prompt(input, s);
          max = prompt(input, s1);
      }//end while
      int guesses = funGame(input, min, max);
      //add the guesses to totGusses
      totGuesses += guesses;
      numGames++;//increment number of games
      System.out.print("Do you want to play again? ");
      repeat = input.next();
      System.out.println();
      }
      report(numGames, totGuesses);
   }
}
