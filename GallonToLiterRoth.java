/* 
name: Tylor Roth
date: Feb 22, 2023p
grade: 100%
description: Conversion app for gallons to liters
1. proper name
2. proper indentation
3. includes comments
4. program compiles
5. program runs
6. meets all requirments 
this program replicates the assignment with all criterion necessary for a passing grade
*/

public class GallonToLiterRoth {

   public static final double GALLON_TO_LITER = 3.78;
   
   public static void main(String [] args) {
   appHeader(); //method one
   conversion(); // method two
   }
   
   /* 
   appHeader method makes a border using a for loop
   and prints the "&" symbol to screen, between the borders
   is the title of the app and description
   */
   public static void appHeader() {
   
      for (int i = 1; i <= 45; i++) {
          System.out.print("&");
      }
      
      System.out.println("\n& This program converts gallons to litters  &");
      System.out.println("\n&     1 Gallon is about 3.7 liters          &");
      System.out.println("\n&                                           &");
      
      for (int i = 1; i <= 45; i++) {
          System.out.print("&");
      }
      
      System.out.println("\n\n\n");  
   }
   
   /*
   conversion method displays gallon and liter title it then
   iterates and multiplies the increment of gallons to liters
   then prints the result to the console.
   */
   public static void conversion() {
   
      System.out.println("Gallon      Liter");
      
      for (int i = 1; i <= 100; i+=4) {
          double liter = i * GALLON_TO_LITER;
          System.out.println(i +"\t\t\t\t"+ liter);
      }
   }
}