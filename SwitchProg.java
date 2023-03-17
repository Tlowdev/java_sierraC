
import java.util.Scanner;
public class SwitchProg {

   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      //foodGrade(input);
     // hours(input);
     test(true, true, true);
   }
   
   public static void foodGrade(Scanner input) {
   System.out.print("Enter a food grade: ");
   String grade = input.next();
   int price = 0;
      //switch for A,B,C food grade
      switch(grade) {
         case "A": price = 30;
            break;
         case "B": price = 20;
            break;
         case "C": price = 10;
            break;
      }
      System.out.println(grade + " is " +price);
      //print statement
   }
   /* 
1Write an if statement to set the variable hours to 10 if the variable flag contains the value true, and x is less than 20
2write an if statement that prints the message "The number is valid" if number contains a value between 1 and 100 inclusive
3write an if statement to check weather x is not great than 20 and is greater than 10
4 Write an if statement to check if the content of the variable x is not  between 1 and 100 inclusive.
5write an if statement to check if x and y are not of opposite signs
6write an if statement to check if the variable x contains a number out of the range of 1 -100
   */
   public static void hours(Scanner input) {
     System.out.print("Select a number: ");
     int x = input.nextInt();
     int hours = 0;
     boolean flag = true;
     
     if (flag && x < 20) {
       System.out.println("x = 20");
     } 
     if (1 < x && x < 100) {
       System.out.println("The number is valid");
     } 
     if (x < 20 && x > 10) {
       System.out.println("True");
     }
     if (x < 1 && x > 100) {
       System.out.println("True");
     } 
   }
   

   public static void test(boolean a1, boolean a2, boolean a3)
    {
        
        
        if( !a1 || ( a2 && a3 ) )
        {
            System.out.println("Got it");
        }
        else
        {
            System.out.println("Did not get it");
        }


            }


}