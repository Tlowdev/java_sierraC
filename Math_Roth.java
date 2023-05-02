/*
Name:Tylor Roth
date:04/20/2023
description:Math question using array
self grade: 100%
*/
import java.util.*;
public class Math_Roth 
{
   public static void main(String[] args)
   {
      prep();
   }
   //This method creates 3 arrays and 2 rand nums and passes them to method populate()
   public static void prep()
   {
      Random rand = new Random();
      Scanner input = new Scanner(System.in);
      String[] math = new String[5];
      int[] answer = new int[5];
      int[] points = new int[5];
      boolean repeat = true;
      while(repeat)//continues app until repeat == false
      {
         for ( int i = 1; i <=45; i++) {//start App header
            System.out.print("*");
         }
         System.out.println();
         System.out.println("There are 5 questions in this quiz.");
         System.out.println("You get a certain amount of points if you answer correctly.");
         System.out.println("Lets take the quiz.");
         for ( int i = 1; i <=45; i++) {
            System.out.print("*");
         }
         System.out.println();//end of App header
   
         int num1 = rand.nextInt(11) + 10;
         int num2 = rand.nextInt(5) + 6;
         populate(math, answer, points, num1, num2);
         int test = test(math, answer, points);
         System.out.println("Your score is: "+test);
         System.out.print("Do you want to play again? ");
         String replay = input.next();
         if (replay.equalsIgnoreCase("no")) {
            repeat = false;
         }
      }
   }
   //Method makes math expressions with arguments from prep()
   public static void populate(String[] quiz, int[] answer, int[] points, int max,
   int min)
   {
      char[] operation = {'*', '/', '+','-'}; // valid operations
      Random rand = new Random();
      for(int i = 0; i < quiz.length; i++)
      {
         int ran1 = rand.nextInt(min, max);
         int ran2 = rand.nextInt(min, max);
         int index = rand.nextInt(4) ;
         char op = operation[index];         
         String expression = ran1 + " " + op + " " + ran2 + " = ";
         quiz[i] = expression;
         answer[i] = calculate(ran1, op, ran2);
         points[i] = rand.nextInt(10) + 1;
      }
   }
   //Method returns calculated value with arguments passed in from prep()
   public static int calculate(int num1, char op, int num2)
   {
      switch(op)
      {
         case '*' :
         return num1 * num2;
         case '/' :
         return num1/num2;
         case '+' :
         return num1 + num2;
         case '-' :
         return num1 - num2;
         default :
         return -1;
      }
   }
   //Method tallies score if user input matches answers and prints results
   public static int test(String[] questions, int[] answers, int[] values)
   {
      int score = 0;
      Scanner input = new Scanner(System.in);
      for(int i = 0; i < answers.length; i++)
      {
         System.out.print(questions[i]);
         int userA = input.nextInt();
         if (userA == answers[i]) 
         {
            score += values[i];
            System.out.println("You earned " + score + " points");
         } else {
            System.out.println("Incorrect answer");
         }
      
      }
      return score;
    }
}