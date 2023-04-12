import java.util. *;
public class DataValidation {

   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      //int kb = val(input);
      //System.out.print(kb);
      boolean cont = true;
    //control loop
      while(cont) {
         question(input, rand);
         System.out.print("Continue? ");
         String choose = input.next();
         if (choose.equalsIgnoreCase("no")) {
            cont = false;
         } else {
            question(input, rand);
         }
       }
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
   //User answers addition questions, if 3 mistakes close out
   public static void question(Scanner input, Random rand) {
      
      int wrong = 0;
      do {
         System.out.println("Answer the questions");
         int num1 = rand.nextInt(20 -1 + 1) + 1;
         int num2 = rand.nextInt(20 - 1 + 1) + 1;
         System.out.print(num1 + " + " + num2 + " = ");
         int answer = input.nextInt();
         if (num1 + num2 == answer) {
            System.out.println("Correct");
         } else {
            System.out.println("Incorrect");
            wrong++;
         }
         
      }while(wrong < 3);
      System.out.println("Thanks for trying");
   }
}