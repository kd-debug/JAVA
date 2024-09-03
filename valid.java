import java.util.Scanner;

public class valid {
    public static boolean checkValidString(String s) {
        int n = s.length();
          int star=0,open=0,close=0;
          char[] str = s.toCharArray();
           if(str[0]=='(' || str[0]=='*')
          {  for(int i=0;i<n;i++)
            {
               if(str[i]=='(')
               { open++; }
                else if(str[i]==')' && (open > close || (star + open) > close))
                { close++; }
                else { star++; } 
            }
            if(close == open || close == open+star || close+star == open)
            {
                return true;
            }
          }
          return false;

    }
    public static void main(String[] args) {
        System.out.println("Enter expression to check valid parenthesis: ['(' / '*' / ')' are allowed]");
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       boolean ans = checkValidString(s);
       System.out.println(ans);
    }
}