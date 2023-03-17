/*
Name:Tylor Roth
Date: Mar 11, 2023
program description: Fill in the story with user input
self grade: 100%
1.Program name: True
2.Proper indentation: True
3.Comments: True
4.Program compiles: True
5.Program runs: True
6.Matchs requirments: True
7.Self grade: True
*/
import java.util.Scanner;

public class StoryRoth {

   public static void main(String [] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("How many times would you like to use this app? ");
      int appLoop = input.nextInt();
      
      for (int i = 1; i <= appLoop; i ++) {
      
         storyInput(input);
      }
      
      System.out.println("Thanks for reading!");
   
   }
   //Method takes user input and creates story.
   public static void storyInput(Scanner input) {
      
      input.nextLine();
      //requirement 1
      System.out.println("What is your name? ");
      String name = input.nextLine();
      //requirement 2
      System.out.print("How old are you?(int) ");
      int age = input.nextInt();
      //requirement 3
      System.out.print("What is the temperature?(double) ");
      double temp = input.nextDouble();
      //requirement 4
      System.out.print("What time is it?(replace \":\" with \".\") ");
      float time = input.nextFloat();
      input.nextLine();
      //requirement 5
      System.out.println("What is your favorite video game? ");
      String game = input.nextLine();
      //requirement 6
      double square = Math.pow(age, 2);
      //requirement 7
      String robotName = game.substring(0, 3);
      //requirement 8
      System.out.print("Choose a direction: ");
      String direction = input.next();
      //requirement 9
      System.out.print("What is your favorite color? ");
      String color = input.next();
      //requirement 10
      System.out.println();
      char initial = color.charAt(0);
      //Story border
      for (int i = 1; i <= 45; i++) {
         System.out.print("*");
      }
      
      System.out.println();
      //Story with 10 different variables
      String story = "Welcome " +name+ " to the world of " +game+ ". \n"
      + "You start in a floating town called " +robotName+ " where it constantly floats " +direction+ ".\n"
      + "You start off with a " +color+ " backpack that holds " +square+ " items.\n"
      + "You can either sell it for $" +time+ " or get " +temp+ "xp to upgrade it.\n"
      + "You have a best friend named \"" +initial+ "\", and have traveld together for " +age+ " years." ; 
      System.out.println(story);
      //story border
      for (int i = 1; i <= 45; i++) {
         System.out.print("*");
      }

      System.out.println();
      
   }
}