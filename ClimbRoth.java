/*
name: Tylor Roth
date: Apr 16, 2023
description: App using conditional loops
self grade: 100%
*/
import java.util.*;
public class ClimbRoth {
   
   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      execute(rand, input);
     
   }
   //ask user for height of mountain
   public static int input(Scanner input) {
      
      int height = 0;
      do {
          System.out.print("Enter the height of the mountain ");
          while(!input.hasNextInt()) {//type validation
            input.nextLine();
            System.out.print("Enter the height of the mountain ");
          }
          height = input.nextInt();
      }while(height <= 0);//int range validation
      return height;
   }
   //increment 20-30 or decrement 1-5
   public static int climb(int height, Random rand) {
   //do/while 
      int slip = 0;
      int distance = 0;
      
      do {
      int direction = rand.nextInt(2);
      if (direction == 1) {
         int step = rand.nextInt(20,30) +1;
         distance += step;
         System.out.println("You climbed up "+ step + " steps");
         if((height - distance) < step) {
            step = height - distance;
            distance += step;
            System.out.println("You've reached the top!");
         }
      } else {
         int step = rand.nextInt(5) +1;
         distance -= step;
         System.out.println("You slipped down " +step+ " steps");
         if (distance != 0) {
            slip +=1;
         }
      }
      }while(height != distance);
   return slip;
   }
   //uses while loop to execute mult times
   public static void execute(Random rand, Scanner input) {
      boolean run = true;
      while(run) {
         int mountain = input(input);
         int start = climb(mountain, rand);
         System.out.println("While climbing the mountain with the height " +mountain+ ", you slipped " +start+ " times.");
         System.out.print("Would you like to continue? ");
         String varify = input.next();
         if (!varify.equalsIgnoreCase("yes"))
         run = false;
         }
         System.out.println("GOOD BYE");
   }
   

}