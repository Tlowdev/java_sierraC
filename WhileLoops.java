import java.util. *;
public class WhileLoops {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      //password(input);
      validYear(input);
   }
   
   public static void password(Scanner input) {
   
      String password = "";
      while (password.length() < 10) {
      
      System.out.print("Choose a password that is atleast 10 in length.");
      password = input.nextLine();
      
      }
   System.out.println(password);
   }
   
   public static void validYear(Scanner input) {
   
      System.out.print("Enter the year you were born: ");
      int bDay = input.nextInt();
      
      while (bDay < 1600 || bDay > 2023) {
         
         System.out.println("Please enter a valid birth year: ");
         bDay = input.nextInt();
         System.out.println("You were born in " + bDay);
      }
      
   }
}