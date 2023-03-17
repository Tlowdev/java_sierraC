/*
Name: Tylor Roth
Date: Feb 7 2023
Program description
self-grade: 100% All requirements met.
*/
public class CookBookChambersRoth 
{
   public static void main(String[] args)
   {
      System.out.println("----------------------------------------");
      System.out.println("This program displays the word COOKBOOK in the following format");
      System.out.println("----------------------------------------\n\n");
      draw();
   }
   /*
     Description : This method calls all the other methods to generate the provided
output
   */
   public static void draw()
   {
      letterC();
      letterO();
      letterO();
      letterK();
      letterB();
      letterO();
      letterO();
      letterK();
   }
   
   /*
      Description: This method draws the letter CC
   */
   public static void letterC()  
   {
      System.out.println("CCCCCCCCC\t\tCCCCCCCCC");
      System.out.println("CC\t\t\t\t\tCC");
      System.out.println("CC\t\t\t\t\tCC");
      System.out.println("CC\t\t\t\t\tCC");
      System.out.println("CCCCCCCCC\t\tCCCCCCCCC\n");
   }
   
   /* 
   Description: This method dispays the letter OO
   */
   
   public static void letterO()
   {
      System.out.println(" OOOOOOOOO\t\tOOOOOOOOO");
      System.out.println("O         O   O         O");
      System.out.println("O         O   O         O");
      System.out.println("O         O   O         O");
      System.out.println(" OOOOOOOOO\t\tOOOOOOOOO\n");
          }
   /*
   Description: This method displays the letter KK
   */
   public static void letterK()
   {
              
      System.out.println("K     K       K     K");
      System.out.println("K    K        K    K");
      System.out.println("K   K         K   K");
      System.out.println("K  K          K  K");
      System.out.println("K K           K K");
      System.out.println("K  K          K  K");
      System.out.println("K   K         K   K");
      System.out.println("K    K        K    K\n");
   }
   /*
   Description: This method displays tthe letter BB
   */
   public static void letterB()
   {
      System.out.println("BBBBBBB       BBBBBBB");
      System.out.println("B     B       B     B");
      System.out.println("B     B       B     B");
      System.out.println("B    B        B    B");
      System.out.println("BBB           BBB");
      System.out.println("B    B        B    B");
      System.out.println("B     B       B     B");
      System.out.println("B     B       B     B");
      System.out.println("BBBBBBB       BBBBBBB\n");
   }
}
