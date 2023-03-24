public class PrintF {

   public static void main(String[] args) {
   
   multiplication();
   }
   
   //multiplication table using printf
   public static void multiplication()
   {
     System.out.printf("%-4s","X"); 
     for(int i= 1; i <= 12; i++)
         System.out.printf("%-4d",i);
     System.out.println();    
     for(int row = 1; row <=12; row++)
     {
        System.out.printf("%-4d",row);
        for(int col = 1; col <=12; col++)
        {
           System.out.printf("%-4d",col*row);
        }
        System.out.println();
     }    
   }
}
