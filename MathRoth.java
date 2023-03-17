/*
name: Tylor Roth
date: Mar 15, 2023
program description: Expressions program
self grade: 110%
1. proper naming: true
2. indentation: true
3. comments: true
4. program compiles: true
5. program runs: true
6. requirments: true
7. self grade: true
*/
import java.util.Scanner;

public class MathRoth {

   public static void main(String [] args) {
   
   run();
   
   }
   //run method holds bulk of program
   public static void run() {
   
      Scanner input = new Scanner(System.in);
      System.out.print("How many times would you like to use this app? ");
      int count = input.nextInt();
      //loop on how many times user wants to use app
      for (int i  = 0; i <= count; i++) {
      
      list();
      System.out.print("select an operation: ");
      String op = input.next();
      System.out.print("Select a number 0-9: ");
      int num1 = input.nextInt();
      System.out.print("Select a number 0-9: ");
      int num2 = input.nextInt();
      //display conversion and total
      System.out.println(convertNumToWord(num1)+ " " +convertOperatorToWord(op)+ " " +convertNumToWord(num2)+ " is "+evaluate(num1, num2, op));
      System.out.println();
      }
   }
   //method used for app menu
   public static void list() {
   
      System.out.println("Enter + for addition");
      System.out.println("Enter - for subtraction");
      System.out.println("Enter * for multiplication");
      System.out.println("Enter / for division");
      System.out.println("Enter ^ for power");
      System.out.println("Enter % for modulus");
      for (int i = 1; i <= 35; i++) {
          System.out.print("*");
      }
      System.out.println();
   }
   //method used to evaluate expression of user input
   public static double evaluate(int num1, int num2, String op) {
      
      //total holds value of operation
      double total = 0;
      
      //if statement checks if user input is within the given range 0-9  
       if (num1 > 9 ||num1 < 0 ||num2 > 9 ||num2 < 0) {
        System.out.print("");
       } 
      else {
      //switch statement for user input operation
      switch(op) {
         case "+": total = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + total);
            break;
         case "-": total = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + total);
            break;
         case "*": total = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + total);
            break;
         case "^": total = Math.pow(num1, num2);
            System.out.println(num1 + " ^ " + num2 + " = " + total);
            break;
         case "/": total = (double)num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + total);
            break;
         case "%": total = num1 % num2;
            System.out.println(num1 + " % " + num2 + " = " + total);
            break;
         default:
            break;
      }
      
      }
      return total;
    }
    
    //method that returns a string equivalent for integer
    public static String convertNumToWord(int num) {
     
      if (num == 0) {
         return "zero";
      }
        else if (num == 1) {
         return  "one";
      } else if (num == 2) {
         return  "two";
      } else if (num == 3) {
         return  "three";
      } else if (num == 4) {
         return  "four";
      } else if (num == 5) {
         return  "five";
      } else if (num == 6) {
         return  "six";
      } else if (num == 7) {
         return  "seven";
      } else if (num == 8) {
         return  "eight";
      } else if (num == 9) {
         return  "nine";
      } 
      else {
         return "None";
      }
    }
    
    //method that converts operation equivalent to words
    public static String convertOperatorToWord(String op) {
    
       switch(op) {
          case "+": op =  "plus";
             break;
          case "-": op =  "minus";
             break;
          case "*": op =  "multiply";
             break;
          case "^": op =  "power";
             break;
          case "/": op =  "divide";
             break;
          case "%": op =  "modulus";
             break;
          default:
             return op = "None";

       }
       return op;
    }
}