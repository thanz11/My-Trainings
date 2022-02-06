public class Varex{
   int myVariable;
   static int data = 30;
   
   public static void main(String args[]){
      Varex obj = new Varex();
      
      System.out.println("Value of instance variable: "+obj.myVariable);
      System.out.println("Value of static variable: "+Varex.data);
   }
}