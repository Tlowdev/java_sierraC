public class Contact {
   //attributes
   private String first;
   private String last;
   private String phone;
   //constructor
   public Contact(String f, String l, String p) {
      first = f;
      last = l;
      phone = p;
   }
   //accessor
   public String getFirst(){
      return first;
   }
   //accessor
   public String getLast(){
      return last;
   }
   //accessor
   public String getPhone(){
      return phone;
   }
   //mutator method
   public void changeLast(String newLast){
      last = newLast;
   }
   //mutator method
   public void changePhone(String newPhone){
      phone = newPhone;
   }
   //required method to rep object
   public String toString(){
      String s = "first: " + first;
      s += "\nlast: " + last;
      s +="\nphone: " + phone;
      return s;
   }
}