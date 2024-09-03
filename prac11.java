import java.util.Scanner;
public class prac11 {
    public static void main(String[] args) {
        System.out.println("Enter your amount in pounds: ");
        Scanner sc = new Scanner(System.in);
        int pound = sc.nextInt();
        int rupee = pound*100;
        System.out.println("Your amount in rupees is: "+rupee);
        System.out.println("\n23DIT007");
    }
}
