public class Array {
   //odd number -6 through 38 in array
   public static void main(String[] args) {
      int size = (38 - (-6)) / 2;//range of array
      int[] odd = new int[size];//initializing size of array
      int index = 0;//index counter/increment
      for (int i = -6; i < 38; i++) {
         if (i % 2 != 0) {//looking for odd numbers
         odd[index] = i;//giving index value of i
         index++;
         }
         
      }
   }
}