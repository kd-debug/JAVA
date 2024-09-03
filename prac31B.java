public class prac31B implements Runnable {
    @Override
    public void run()
    {
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        prac31B runnable = new prac31B();
        //Thread t = new Thread(runnable);
        //t.run();
        runnable.run();
    }
}
