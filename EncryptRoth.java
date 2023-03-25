/*
name: Tylor Roth
date: mar 25 2023
description: Caesar cipher encryption/decryption
grade: 100%
proper name: true
indentation: true
comments: true
program compiles: true
program runs: true
requirments: true
self grade: true
*/
import java.util.Scanner;

public class EncryptRoth {

   public static void main(String[] args) {
      runApp();
   }
   
   //method holds bulk of program
   public static void runApp() {
   
   Scanner input = new Scanner(System.in);
   //create a 20x loop
   for (int i = 0; i <= 20; i++){
   
         appMenu();
         
         System.out.println("What would you like to do? ");
         String select = input.next();
         input.nextLine();
         
         //checks if user input is either e or d ignore case
         if (!(select.equalsIgnoreCase("E") ||
            select.equalsIgnoreCase("D"))) {
               
               System.out.println("Invalid choice");
               continue;
               
            }
                    
          System.out.println("Enter a message, no numbers allowed");
          String message = input.nextLine();
          
          System.out.print("Enter a key: ");
          int key = input.nextInt();
          
          //checks if key is a positive number
          if (key <= 0) {
            System.out.println("key must be a positive number");
          }
          //if input is "e or E" go to method encrypt
          else if (select.equalsIgnoreCase("E")) {
          
            System.out.println(message.toUpperCase());
            encrypt(message, key);
            
          }
          //if input is "d or D" go to method decrypt
          else if (select.equalsIgnoreCase("D")) {
          
            decrypt(message, key); 
            
          }
        }
  }
   
   //this method returns a encrypted string
   public static void encrypt(String s, int key) {
      
      String upper = s.toUpperCase();
      String crypt = "";
      
      //loops through string length
      for (int i = 0; i < upper.length(); i++) {
      
         //selects individual char
         char letter = upper.charAt(i);
         
         //checks if char is between A and Z
         if (letter >= 'A' && letter <= 'Z') {
            //converts char to number  
            int toNum = (letter + key);
            
            //if number is greater than Z      
            if (toNum > 'Z') {
            
               toNum = toNum - 26;
               
               }
            //if number is less than A
            else if (toNum < 'A') {
            
               toNum = toNum + 26;
               
            }
            //converts number to char and adds char to string
            char toChar = (char) toNum;
            crypt += toChar;
         }
         //checks for spaces
         else if(letter == ' ') {
            letter = '#';
            crypt += letter;
         }   
      }
      System.out.println("The encrypted message is: " + crypt);
   }
   
   //this method returns a decrypted string
   public static void decrypt(String s, int key) {
   
      String decrypt = "";
      
      //loops through length of string   
      for (int i = 0; i < s.length(); i++) {
      
         //selects individual char   
         char letter = s.charAt(i);
         //checks if char is between A and Z
         if (letter >= 'A' && letter <= 'Z') {
         
            //converts char to number       
            int toNum = (letter - key);
               
            //if number is less than A         
            if (toNum < 'A') {
               toNum += 26;
            }
            //if number is greater than Z
            else if (toNum > 'Z') {
               toNum -= 26;
            }
            
         //converts num to char
         char toChar = (char) toNum;
         //adds char to initial string      
         decrypt += toChar;    
         }
         //checks for # in string
         else if (letter == '#') {
            letter = ' ';
            decrypt += letter;
         } 
      }
      System.out.println("The decrypted message is: " + decrypt);   
   }
   
   //user guide method
   public static void appMenu() {
   
      System.out.println("Enter \"e or E\" to encrypt your message");
      System.out.println("enter \"d or D\" to decrypt your message");
      for (int i = 1; i <= 45; i++) {
         System.out.print("^");
      }
      System.out.println();
   }
}