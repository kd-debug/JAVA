public class prac20 {
    public static void main(String[] args) {
        Degree d = new Degree();
        System.err.println("Calling Degree class method with object of parent class");
        d.getDegree();
        Undergraduate U = new Undergraduate();
        System.err.println("Calling Degree and Undergraduate class method with object of UG class");
        U.ug();
        U.getDegree();
        Postgraduate P = new Postgraduate();
        System.err.println("Calling Degree and Postgraduate class method with object of PG class");
        P.pg();
        P.getDegree();
        System.out.println("23DIT007");
    }
}
class Degree{
    void getDegree()
    {
        System.out.println("I got a degree.");
    }
}
class Undergraduate extends Degree{
   void ug()
   {
    System.out.println("I am an Undergraduate.");
   }
}
class Postgraduate extends Degree{
    void pg()
    {
        System.err.println("I am a Postgraduate.");
    }
}