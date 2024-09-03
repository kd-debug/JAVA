 class mythread extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Run method!");
        }
    }
}

public class multithread {
    public static void main(String[] args) {
        mythread m = new mythread();
        m.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main method!");
        }
    }
}
