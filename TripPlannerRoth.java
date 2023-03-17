/*
name: Tylor Roth
date: Mar 2, 2023
program description: Gas/Electric car trip planner
self grade: 100%
proper naming: True
Indentation: True
Comment: True
Program compiles: True
Program runs/matchs: True
requirments: True
self grade: True
*/
//ideas to make this better
//Make exact calcualtion for electric costs 
// make total miles/speed the same for both electric and gas
import java.util.Scanner;
public class TripPlannerRoth {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      appHeader();
      run(input);
      System.out.println("GOOD BYE");
   }
   
   //application description
   public static void appHeader() {
      
      for (int i = 1; i <=63; i++) {
         System.out.print("*");
      }
      System.out.println();
      System.out.println("This program calculates the cost and the time to travel to your \ndestination");
      System.out.println("given the needed information for both gas car and the electric car.\nJust answer some simple questions");
      
      for (int i = 1; i <=63; i++) {
         System.out.print("*");
      }
   }
   
   //method that holds bulk of program
   public static void run(Scanner input) {
      System.out.println();
      System.out.print("How many times do you want to use the app: ");
      int appUse = input.nextInt();
      
      //loop used to run method user input amount of times
      for(int i=1; i<=appUse; i++){
      //insert bulk methods here
      gasTravel(input);
      electricTravel(input);
      }
   }
   
   //method takes user input on gas car
   public static void gasTravel(Scanner input) {
   
      System.out.println("Traveling with a gas car");
      System.out.println();
      
      System.out.print("Enter total miles that you are traveling: ");
      int miles = input.nextInt();
      
      System.out.print("Enter speed of your car: ");
      double speed = input.nextInt();
      
      System.out.print("Enter miles per gallon: ");
      double mpg = input.nextDouble();
      
      System.out.print("Enter cost per gallon of gas: ");
      double gas = input.nextDouble();
      
      System.out.println();
      System.out.println("Traveling with your gas car:");
      //insert methods
      double travel = travelHoursGasCar(speed, miles);
      double costGas = gasCost(miles, mpg, gas);
      
      for (int i = 1; i <=63; i++) {
         System.out.print("*");
      }
      System.out.println();
   }
   
   //method for gas car total time traveld
   public static double travelHoursGasCar(double speed, double miles) {
      double totalTime = miles / speed;
      System.out.println("Hours " + totalTime);
      return totalTime;
   }
   
   //method for gas car total cost
   public static double gasCost(double miles, double mpg, double gas) {
      double totalGasPrice = miles / mpg * gas;
      System.out.println("Cost " + totalGasPrice);
      return totalGasPrice;
   }
   
   //method takes user input on electric car
   public static void electricTravel(Scanner input) {
      System.out.println();
      System.out.println("Traveling with a electric car");
      System.out.println();
      System.out.print("Enter total miles that you are traveling: ");
      int distance = input.nextInt();
      
      System.out.print("Enter speed of your car: ");
      double speed = input.nextInt();
      
      System.out.print("Enter the number of the miles that you can travel with a fully charged \nbattery: ");
      int milesPerCharge = input.nextInt();
      
      System.out.print("Enter the number of the hours it takes to charge your car: ");
      double hoursPerStop = input.nextDouble();
      
      System.out.print("Enter the amount money you need each time to fully charge the battery of \nyour car: ");
      double pricePerCharge = input.nextDouble();
      
      System.out.println();
      System.out.println("Traveling with your electric car:");
      //insert methods
      int charge = stops(distance, milesPerCharge);
      double travel = travelHoursWithElectricCar(charge, hoursPerStop, distance, speed);
      double costElectric = chargeCost(charge, pricePerCharge);
      for (int i = 1; i <=63; i++) {
         System.out.print("*");
      }
      System.out.println();
   }
   
   //method for electric car total time traveld
   public static double travelHoursWithElectricCar(double charge, double hoursPerStop,
                                                   int distance, double speed) {
                                                   
      double totalHours = charge * hoursPerStop + distance / speed;
      System.out.println("Hours " + totalHours);
      return totalHours;                                             
   }
   
   //method for electric car charge info
   public static int stops(int distance, int milesPerCharge) {
      int stops = distance / milesPerCharge;
      return stops;
   }
   
   //method for electric car costs
   public static double chargeCost(double stops, double pricePerCharge) {
      double cost = stops * pricePerCharge;
      System.out.println("Cost " + cost);
      return cost;
   }

}