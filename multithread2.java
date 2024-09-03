class Mythread extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Number: "+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multithread2 {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        for(int i=0;i<4;i++)
        {
            System.out.println("Main thread!");
        }     
    }
   
}
