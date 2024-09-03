import java.io.*; 

public class checked {
    public static void readFromFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName); // Checked Exception: FileNotFoundException
        BufferedReader fileInput = new BufferedReader(file);
        for (int counter = 0; counter < 3; counter++) {
            System.out.println(fileInput.readLine());
        }
        fileInput.close();
    }
    // Method to demonstrate unchecked exception
    public static void divide(int a, int b) {
        int result = a / b; // Unchecked Exception: ArithmeticException
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        // Checked Exceptions Example
        try {
            readFromFile("non_existent_file.txt"); // FileNotFoundException
        } catch (IOException e) {
            System.out.println("Checked Exception caught: " + e.getMessage());
        }

        try {
            divide(5, 0); 
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e.getMessage());
        }
        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
