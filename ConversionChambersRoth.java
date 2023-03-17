/*
Name: Tylor ChambersRoth
date: 16 Feb 2023
Description: conversion program
self-grade: 100.0
1. proper name 
2. proper indentation 
3. includes comments 
4. program compiles 
5. program runs 
6. meets all requirments 
*/ 

/*__________________________________________________________________________________
_____________
Sample output: your code must match this output
2042 pennies is equal to: 
20 dollars
1 quarters
1 dimes
1 nickels
2 pennies
*****************************
3255 ounces is equal to 203.0 and 7.0 ounces
 *****************************
5 cups is equal to 1.2 liters
 *****************************
10.0 kilograms is equal to 22.22222222222222 pounds
 *****************************
120.0 kilometer per hour is equal to 75.0 miles per hour
___________________________________________________________________________________
______________________
*/
public class ConversionChambersRoth
{
   public static void main(String[] args)
   {
     penniesTodollars();
     System.out.println("*****************************");
     ounceToPound();
     System.out.println("*****************************");
     cupsToLiter();
     System.out.println("*****************************");
     poundsToKilo();
     System.out.println("*****************************");
     kilometerToMile();
     System.out.println("*****************************");
     
   }
   /* This method finds the number of dollars, quarters dimes, nikels and pennies 
in 2042 pennies
   for example 138 pennies is:
   138 / 100 = 2 dollars
   138 % 100 = 38 pennies left
   38/25 = 1 quarter
   38 % 25 = 13 pennies left
   13/10 = 1 dime
   13%10 = 3 pennies left
   3/ 5 = 0 nikel
   3 % 5 = 3 pennies
   therfore 138 pennies is equla to 2 dollars, 1 quarter, 1 dime, 0 nikel and 3 
pennies
   Must generate the exact outp*/
   public static void penniesTodollars()
   {
      int money = 2042;
      int pennies = 2042;
      //your code      
      int dollar = 100;
      int quarter = 25;
      int dime = 10;
      int nickel = 5;
      int penniesToDollar = pennies/dollar;
      int quarterLeft = pennies%dollar/quarter;
      int dimesLeft = pennies%dollar%quarter/dime;
      int nickelLeft = pennies%dollar%quarter%dime/nickel;
      int penniesLeft = pennies%dollar%quarter%dime%nickel/1;
      //Display to console
      System.out.println(pennies+" pennies is equal to:");
      System.out.println(penniesToDollar+" dollars");
      System.out.println(quarterLeft+" quarters");
      System.out.println(dimesLeft+" dimes");
      System.out.println(nickelLeft+" nickels");
      System.out.println(penniesLeft+" pennies");
            
   }
   /*This method converts ounces to pounds and ounces
   1 pound is 16 ounces
    
   For example 35 ounces is 2 pounds and 3 ounces
   How many pounds and ounces are in  3255 ounces*/
   public static void ounceToPound()
   {
      int ounce = 3255;
      //your code
      int pound = 16;
      double ounceToPound = ounce/pound;
      double leftOverOunces = ounce%pound;
      //Display
      System.out.println(ounce+" ounces is equal to:");
      System.out.println(ounceToPound+" pounds");
      System.out.println(leftOverOunces+" ounces");  
   }
   
   /*This method convers 5 cups to litter and displays it
   1 cup is equla to .24 litter
   */
   public static void cupsToLiter()
   {
      int cups = 5;
      //your code
      double cupToLiter = 0.24;
      double cupInLiter = cups*cupToLiter;
      //display
      System.out.println(cups+" cups is equal to:");
      System.out.println(cupInLiter+" liters");
   
   }
   /* this method converts 10 kilogram  to pounds. 1 pound is .45 kilogram*/
   public static void poundsToKilo()
   {
      double kilogram = 10;
      //your code
      double poundInKilogram = 2.20462;
      double poundsToKilogram = kilogram*poundInKilogram;
      //display
      System.out.println(kilogram+" kilograms is equal to:");
      System.out.println(poundsToKilogram+" pounds");
   }
   /*
   this method converts speed in kilometer per hour to mile  per hour
   1 mile per hour is equal to 1.6 kilometer per hour
   convert 120 kilometer per hour to miles pr hour
   */
   public static void kilometerToMile()
   {
       double kph = 120;
       //your code
       double mphInKph = 0.621371;
       double kphToMph = kph * mphInKph;
       //display
       System.out.println(kph+" kilometer is equal to:");
       System.out.println(kphToMph+" miles per hour");  
   }
   
}
