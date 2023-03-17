import java.util.Scanner;
public class PlayGround {

   public static void main(String [] args) {
   Scanner input = new Scanner(System.in);
   //practiceMethod();
   //ex();
   //figure();
   // int fiveFeet = 5;
   //System.out.println(fiveFeet + " feet is = "+feetToInches(fiveFeet)+ " in inches.");
   //age(1990);
   //vertical(input);
   //String goodDay = "Racecar";
   //printReverse(goodDay);
   //processName(input);
   //printIndexed(goodDay);
   //triangleArea(8, 5.2, 7.1);
   //sphere(2.0);
   //cylinderSurfaceArea(3.0, 4.5);
    // int x = 5;
//     int y = 10;
//     idk(x,y);
//     System.out.println(x+" "+ y);
      // String s = "Apple"; 
//       for(int i = 0; i < s.length(); i++)
//        {
//           System.out.print(s.charAt(i)+ ""+ i);
//        }
      System.out.println("Java programming".charAt(2));
   }
   public static void practiceMethod() {
    
       int number = 4;
       for (int count = 1; count <= number; count++) {
           System.out.println(number);
           number = number / 2;
       }   
       
       for(int i = 7 ; i >= 0; i--)
{
    System.out.print(i * i + " ");
}

   }
   public static void ex() {
   
      for(int i = 1000; i > 10;  i/= 2){
      System.out.print(i+" ");  
      }
  }
  
  public static void figure() {
  
   for (int row = 1; row <= 5; row++) {
      
      for (int fs = 1; fs <= 16 -(row-1) * 4 ; fs++) {
         System.out.print("/");
      }
      
      for (int star = 1; star <= (row-1) * 8; star++) {
          System.out.print("*");
       }
      
      for (int bs = 1; bs <= 16 - (row-1) * 4; bs++) {
         System.out.print("\\");
       }
   System.out.println();
   }
  }
  
  public static int feetToInches(int foot) {
  
   int feetInches = foot * 12;
   return feetInches;
  }
  
  public static int age(int year) {
  
   int myAge = 2022 - year - 1;
   System.out.println(myAge);
   return myAge;
  
  }
  //print strings vertically
  public static void vertical(Scanner input) {
   
   System.out.println("make a string: ");
   String line = input.nextLine();
   for (int i = 0; i < line.length(); i++) {
      System.out.println(line.charAt(i));
   }
  }
  //reverses strings
  public static void printReverse(String s) {
   
   for (int i = s.length()-1; i >= 0; i--) {
      System.out.print(s.charAt(i));
   }   
  }
  //changes first and last name places
  public static void processName(Scanner input) {
  
   System.out.println("Enter your name: ");
   String name = input.nextLine();
   int space = name.indexOf(" ");
   String first = name.substring(0, space);
   String last = name.substring(space);
   System.out.println(last + "," + first);
  }
  
 public static void printIndexed(String s) {
   int last = s.length() -1;
   for (int i = 0; i <= last; i++) {
      System.out.print(s.charAt(i) + "" + (last - i));
      
   }
 }
 //Area of triangle with 3 lengths
 public static double triangleArea(double x, double y, double z) {
 
   double w = (x + y + z) / 2;
   double area = Math.sqrt(w*(w-x)*(w-y)*(w-z));
   System.out.println(area);
   return area;
 }
 //Volume of sphere
 public static double sphere(double y) {
  
   double volume = 4.0/3 * Math.PI * Math.pow(y, 3); 
   System.out.println(volume);
   return volume;
  }
  
 public static double cylinderSurfaceArea(double height , double radius) {
 
   double area = 2.0 * Math.PI * radius * (radius + height);
   System.out.println(area);
   return area;
 }
 
 public static void idk(int x, int y) {
   int z = x + y;
     x++;
     y++;
     System.out.println(x + " " + y +" "+ z);
 }
}