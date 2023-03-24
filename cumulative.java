
import java.util.Scanner;
public class cumulative {

   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   
   //cumulativeFrac();
   //deposit(input);
   //cumulativeAvg(input);
   //concStr(input);
   neWord(input);
   
   }
   
   /*
   method example of cumulative algorithm
   */
   public static double cumulativeFrac() {
   
      double sum = 0;
      for (int i = 1; i <= 50; i++) {
         sum += 1.0/i;
      }
   System.out.println("The sum of 1 + 1/2 - 1/50: " + sum);
   return sum;
   }
   
   /*
   This method based on $0 in saving ask user input
   on how much is put into savings each month.
   */
  public static double deposit(Scanner input) {
  
   double savings = 0;
   for (int i = 1; i <= 12; i ++) {
   
      System.out.print("Enter amount saved for month " + i + ": ");
      double money = input.nextDouble();
      
      savings += money;
   }
  System.out.println("your total savings is = " + savings);
  return savings;
  }
  
  /*
  this method finds the average in a range from 1 to user input
  */
  public static double cumulativeAvg(Scanner input) {
   
   System.out.print("Pick a range of number to find the average: ");
   double range = input.nextDouble();
   
   double avg = 0;
   for (int i = 1; i <= range; i++) {
   
      avg += i/range;
   } 
   System.out.println("The average of the range 1 - " + range + " is: " + avg);  
   return avg;
  }
  
  //class example of cumulative string concatination
  public static void concStr(Scanner input) {
  
   String threeStr = "";
   System.out.print("Enter a word: ");
   String word = input.next();
   
   for (int i = 1; i <= 3; i++) {
       threeStr += word;     
   }
   System.out.println(threeStr);
  }
  
  //studder cumulative string
  public static void neWord(Scanner input) {
  
   System.out.print("Enter a word: ");
   String word = input.next();
   String twice = "";
   for (int i = 0; i < word.length(); i++) {
       char c = word.charAt(i);
       twice = twice + c + c;        
   }
   System.out.println(twice);
  }
}