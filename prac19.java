public class prac19 {
    public static void main(String[] args) {
        Square square = new Square(1);
        
       square.printShape();
        
        square.printRectangle();
        
        square.printSquare();
    }
}
 class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

 class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

 class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is circular shape");
    }
}

 class Square extends Rectangle {
     int x;
    public Square(int i){ x=i; }
     void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

