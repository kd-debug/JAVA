import java.util.Scanner;
 class parent{
    void print()
    {
        System.out.println("This is parent class");
    }
 }
 class child extends parent
 {
    void put()
    {
        System.out.println("This is child class");
    }
 }
 class prac16{
    public static void main(String[] args) {
        child c = new child();
        parent p = new parent();
        System.out.println("Calling method of parent class through object of parent class::");
        p.print();
        System.out.println("Calling method of child class through object of child class::");
        c.put();
        System.out.println("Calling method of parent class through object of child class::");
        c.print();
        System.out.println("23DIT007");
    }
 }