class ForLoops 
{

   public static void main(String [] args) 
   {
   //hundToTwo();
   //forLoop2();
   //sqLoop();
   //prob4();
   //prob5();
   //prob6();
   //money();
   practice();
   }
   
   public static void hundToTwo()
   {
      for(int i = 100; i >= 2; i-=2)
         {
         System.out.println(i);
         }
   }
   
   public static void forLoop2()
   {
      for(int i = 0; i <= 10; i++)
         {
         int num = -4 + 18 * i;
         System.out.println(num);
         }
   }
   
   public static void sqLoop()
   {
      for(int i = 0; i <= 10; i++)
         {
         int num = i * i;
         System.out.println(num);
         }
   }
   
   public static void prob4()   
   {
      System.out.println("KPH \tMPH");
      for(int i = 90; i <= 130; i+=10)
         {
         double mph = i * .62;
         System.out.println(i +"  \t" +mph);
         }
   }
   
   public static void prob5()
   {
      for (int i =70; i >= 0; i--)
         {
         System.out.println("There is "+i+" days until Thanksgiving!");
         }
      System.out.println("Finally we get to eat turkey!");
   }
   
   public static void prob6()
   {
      for (int i = 1; i <= 10; i++)
         {
         int distance = i * 40;
         System.out.println("A train that travels for "+i+" hour at a speed of 40 mph will go " +distance+" miles");
         }
   } 
   
   public static void money()
   {
      for (int i = 1; i <= 20; i++){
         int money = 0;
         for (int j = 1; j <= i; j++){
            money = (money + j);
         }
         System.out.println("day "+i+" maria has "+money+"$");

      }
    }
      
   public static void practice() {
   
      for (int i = 1; i <= 5; i *= i){
         System.out.println(i);
      }
   }

}