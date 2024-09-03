public class trycatch {
    public static void main()
    {
        int arr[] = new int[6];
        try {
            arr[6] = 10/0;
        }catch(ArithmeticException c)
        {
            System.out.println("Specific 1");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Specific 2");
        }
         catch (Exception e) {
            System.out.println("general");
        }
                
        System.out.println("Rest!!");
    } 
}
