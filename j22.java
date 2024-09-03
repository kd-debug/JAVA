import java.util.Scanner;

public class j22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape C = new Circle();
        Shape R = new Rectangle();
        
        System.out.println("Enter the shape: \n1.Circle \n2.Rectangle");
        int choice = input.nextInt();
        input.nextLine(); 

        if (choice == 1) {
            C.input();
            C.output();
        } else if (choice == 2) {
            R.input();
            R.output();
        } else {
            System.out.println("Invalid choice.");
        }
        
        input.close();
    }
}

interface Shape {
    void input();
    void output();
}

class Sign {
    private String text = "";
    private String color = "";
    private float area;
    
    public void setArea(float a) {
        area = a;
    }
    
    public void setColor(String c) {
        color = c;
    }
    
    public void setText(String t) {
        text = t;
    }
    
    public float getArea() {
        return area;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getText() {
        return text;
    }
}

class Circle extends Sign implements Shape {
    private float r;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        r = sc.nextFloat();
        sc.nextLine(); 
        
        float a = (float) (Math.PI * r * r);
        setArea(a);
        
        System.out.println("Enter color of circle: ");
        String c = sc.nextLine();
        setColor(c);
        
        System.out.println("Enter text: ");
        String t = sc.nextLine();
        setText(t);
    }
    
    @Override
    public void output() {
        System.out.println("Area of circle: " + getArea());
        System.out.println("Color of circle: " + getColor());
        System.out.println("Text inside circle: " + getText());
    }
}

class Rectangle extends Sign implements Shape {
    private float l, b;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        l = sc.nextFloat();
        System.out.println("Enter breadth of rectangle: ");
        b = sc.nextFloat();
        sc.nextLine(); 
        
        float a = l * b;
        setArea(a);
        
        System.out.println("Enter color of rectangle: ");
        String co = sc.nextLine();
        setColor(co);
        
        System.out.println("Enter text: ");
        String t = sc.nextLine();
        setText(t);
    }
    
    @Override
    public void output() {
        System.out.println("Area of rectangle: " + getArea());
        System.out.println("Color of rectangle: " + getColor());
        System.out.println("Text inside rectangle: " + getText());
    }
}
