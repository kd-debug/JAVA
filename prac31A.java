public class prac31A extends Thread {
    @Override
    public void run(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        prac31A threadA = new prac31A();
        threadA.start();
    }
}
