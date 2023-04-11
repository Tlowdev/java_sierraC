import java.util. *;
public class DataValidation {

   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      int kb = val(input);
      System.out.print(kb);
   }
   
   public static int val(Scanner input) {
      
      int age = 0;
      while (age <= 0 || age > 100) {
         System.out.print("Enter your age: ");
         while(!input.hasNextInt()) { //checks if input is Int
            input.nextLine();//discards user input
            System.out.print("Enter your age: ");         
            }
            age = input.nextInt();
      }
   
      return age;
   }
}