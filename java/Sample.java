public class Sample{
   static int num = 50;
   public void demo(){
      System.out.println("Value of num in the demo method "+ Sample.num);
   }
   public static void main(String args[]){
      System.out.println("Value of num in the main method "+ Sample.num);
      new Sample().demo();
   }
}