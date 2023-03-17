public class DrawRoth {
/* name: Tylor Roth
   grade: 100%
   1. proper name
   2. proper indentation
   3. includes comments
   4. program compiles
   5. program runs
   6. meets all requirments
   7. "generate CSD" 
   this program replicates the assignment with all criterion necessary for a passing grade
*/

   public static void main(String [] args) {
      chimney();   // First static method called
      trainCars(); // Second static method called
      walkWay();   // Third static method called
   }
   
   public static void chimney() {
   // this static method is to be called first in main method 
      System.out.println("           ~                              ~         ");
      System.out.println("           ~~                             ~~        ");
      System.out.println("          ~~~                            ~~~        ");
      System.out.println("        ~~~~~~                         ~~~~~~       ");
      System.out.println("         / \\                            / \\       ");
      System.out.println("        /   \\                          /   \\      ");
      System.out.println("       /     \\                        /     \\     ");
      System.out.println("      /       \\                      /       \\    ");
      System.out.println("         |\"|                            |\"|       ");
      System.out.println("         |\"|                            |\"|       ");
      System.out.println("         |\"|                            |\"|       ");
   }
   
   public static void trainCars() {
   // proper name convention/rule for method
   // this static method is to be called second in main method
      System.out.println(" --------    --------           --------    --------");
      System.out.println("|                     |        |                     |");
      System.out.println("| ---           ---   |        | ---           ---   |");
      System.out.println("| ---           ---   |@------@| ---           ---   |");
      System.out.println("|                     |@------@|                     |");
      System.out.println("|_____________________|        |_____________________|"); 
   }
   
   public static void walkWay() {
   // proper name convention/rule for method
   // this static method is to be called third in main method
      System.out.println("    CCC//////CCC                    CCC//////CCC      ");
      System.out.println("    CCC\\\\\\\\\\\\CCC                    CCC\\\\\\\\\\\\CCC"); // appropriate use for escape characters
      System.out.println("    CCC//////CCC                    CCC//////CCC      ");
   }
   // The End
}