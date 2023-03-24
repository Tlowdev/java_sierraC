/*
name: Tylor Roth
date: mar ** 2023
description: Caesar cipher encryption/decryption
grade: %
*/
import java.util.Scanner;

public class EncryptRoth {

   public static void main(String[] args) {
      runApp();
   }
   
   public static void runApp() {
   Scanner input = new Scanner(System.in);
   //create a 20x loop
   for (int i = 0; i <= 20; i++){
         appMenu();
         /*
         collect user input 
         input e/E for encrypt
         input d/D for decrypt use equalsIgnoreCase()
         make sure its a valid choice
         input on key number must be positive (if/else)
         (if/else) for encrypt and decrypt deponding on input
         
         */
      }
   }
   //this method returns a encrypted string
   public static void encrypt(String s, int key) {
   
   /*
   String must be converted to uppercase toUpperCase()
   initialize a empty string
   create a for loop to go through each char of string
   replace spaces with #
   cumulative sum...int of enter string than add key to string to create encrypted string
   */
   
   }
   //this method returns a decrypted string
   public static void decrypt(String s, int key) {
   /*
   initialize an empty strng
   create a for loop to access each char at index
   subtract key value from char to decrypt string
   */
   
   }
   public static void appMenu() {
   
      System.out.println("Enter \"e or E\" to encrypt your message");
      System.out.println("enter \"d or D\" to decrypt your message");
      for (int i = 1; i <= 45; i++) {
         System.out.print("^");
      }
      System.out.println();
   }
}