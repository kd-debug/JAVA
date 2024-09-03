import java.util.Scanner;

class prac3
{
   public static void main()
   {
      Scanner number= new Scanner(System.in);
      System.out.println("Enter the mobile number: ");
      String mob = number.nextLine();
      System.out.println("Mobile operator code is " + mob.substring(0,2) + " MSC is " +mob.substring(2,5) + " Unique code is "+ mob.substring(5) );
      System.out.println("23DIT007");   

   }
}
