import java.util.Scanner;
import java.util.Random;

class pract5{
    public static void main(String[] args)
    {
       Random r = new Random();
       int random = r.nextInt(100);
       Scanner input = new Scanner(System.in);
       int[] user = new int[50];
       int i=0;
       do
       {
        System.out.println("Guess any number between 1-100(Attempt"+(i+1)+" ):\n");
        user[i] = input.nextInt();
        if( random - user[i] <=10)
        {
            System.out.println("\nYou are too close to the number but your number is smaller.");
        }
        else if( user[i] -random <=10 )
        {
            System.out.println("\nYou are too close to the number but your number is bigger.");
        }
        else if(random - user[i] >10)
       {
         System.out.println("\nYou are not close to the number but your number is smaller.");
       }
       else 
       {
        System.out.println("\nYou are not close to the number but your number is bigger.");
       }
       i++;
    }while(user[i] == random);
 System.out.println("23DIT007");   
}
}