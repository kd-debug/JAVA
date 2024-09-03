import java.util.Scanner;
public class InvalidAgeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int n = sc.nextInt();
        try{
            if(n < 18)
            {
                throw new Exception("Not eligible for voting");
            }
            else{
                System.out.println("Eligible for voting");
            }
        }
        catch(Exception e)
        {
            System.out.println(e+" in 2019");
        }
    }
}
