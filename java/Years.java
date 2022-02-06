import java.util.Scanner;
class Years
{
   public static void main(String[] args)
   {
      int year;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Year: ");
      year = scan.nextInt();
      
      if(year%4==0 && year%100!=0)
         System.out.println("\nIt is a Leap Year.");
      else if(year%400==0)
         System.out.println("\nIt is a Leap Year.");
      else
         System.out.println("\nIt is not a Leap Year.");
   }
}