public class prac18 {
    public static void main(String[] args) {
        
    Rectangle[] rectangles = new Rectangle[2];
        Rectangle rectangle = new Rectangle(4, 5);
        rectangles[0] = rectangle;

        Square square = new Square(3);
        rectangles[1] = square;

        for (Rectangle rect : rectangles) {
            rect.printArea();
            rect.printPerimeter();
            System.out.println();
        }
        System.out.println("23DIT007");
  }
}
 class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        System.out.println("Area: " + (length * breadth));
    }

    public void printPerimeter() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }
}

// Square class inheriting from Rectangle
 class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}


