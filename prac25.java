import java.util.Scanner;
public class prac25 {
    public static void check(int x) throws Exception
    {
        int sum = 0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            sum+=i;
        }
        if(sum == x+1)
        {
            throw new Exception("The given number is prime");
        }
        else
        System.out.println("The sum is: "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-prime number to get the sum of all its divisors.");
        int x= sc.nextInt();
       try{
        check(x);
       }
       catch(Exception e)
       {
        System.out.println(e);
       }
    }

}
