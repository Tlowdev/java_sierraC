/*
name: Tylor Roth
date: May 3, 2023
description: Sales rep OOP
grade: 100%
*/
public class SaleStudentRoth {
   //class instances
   private double startingSalary;
   private double comissionRate;
   private double sales;
   private String fullName;
   //constructor
   public SaleStudentRoth(double s, double c, String f ) {
      startingSalary = s;
      comissionRate = c;
      fullName = f;
      sales = 0;
   }
   //getter methods
   public double getStartingSalary(){
      return startingSalary;
   }
   public double getComissionRate(){
      return comissionRate;
   }
   public String getFullName(){
      return fullName;
   }
   //setter methods
   public void setNewSalary(double newSalary){
      startingSalary = newSalary;
   }
   public void setNewRate(double newComission){
      comissionRate = newComission;
   }
   public void setNewFullName(String newFullName){
      fullName = newFullName;
   }
   public String toString(){
      String s = " ";
      s += "\nFull name: " + fullName + "| ";
      s += "Starting salary: " + startingSalary + "| ";
      s += "Sales amount: " + sales + "| ";
      s += "pay check: " + paycheck();
      s += "\nThe commission you made: " + getComission();
      s += "\nTotal paid this month: " + paycheck();
      return s;
   }
   //calculates commission
   public double getComission(){
      return sales * comissionRate/100;
   }
   //total pay with commission
   public double paycheck(){
      return startingSalary + getComission();
   }
   //updates sales
   public void addSale(double newSale){
      sales += newSale;
   }
   //updates remove sales
   public void returnItem(double amountReturned){
      sales -= amountReturned;
   }
   //updates starting salary
   public void getRaise(double raiseRate){
      startingSalary = startingSalary + (startingSalary * raiseRate/100);
   }
}

class SaleStudentRothDriver
{
   public static void main(String[] args)
   {
      //create the first object
      SaleStudentRoth jose = new SaleStudentRoth(1000,6,"Jose Rodriguez");
      jose.addSale(5000);
      jose.addSale(3000);
      jose.addSale(1200);
      jose.returnItem(5000);
      jose.addSale(345);
      System.out.println(jose);
      jose.getRaise(5);
      System.out.println(jose.toString());
      //call the proper methods similar to the given code in the MyDriver class
      //****************************
      //create the second object and call the proper methods similar to the code
      //given in the driver above
      SaleStudentRoth fazz = new SaleStudentRoth(2400,10,"Fazz Flav");
      fazz.addSale(10000);
      fazz.addSale(135);
      System.out.println(fazz);
      fazz.getRaise(25);
      fazz.addSale(1000000);
      fazz.setNewFullName("Abra Kadabra");
      fazz.returnItem(1010000);
      System.out.println(fazz.toString());
   }
}
