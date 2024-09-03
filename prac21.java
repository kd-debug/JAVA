import java.util.Scanner;

public class prac21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        MyCalculator c= new MyCalculator();
        int s = c.divisor_sum(a);
        System.out.println("The sum of divisors of given number is: "+ s);
        System.out.println("23DIT007");
    }
}
interface AdvanceArethmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvanceArethmetic{
public int divisor_sum(int n)
{
    int sum=1+n;
    for(int i=2;i<n;i++)
    {
        if(n%i == 0)
        { sum += i; }
    }
    return sum;
}
   
}