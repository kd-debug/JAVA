import java.util.Random;

class Mythreadone extends Thread{
    Random rand = new Random();
   public int r = rand.nextInt(1000);
   public void run(){
    if(r%2 == 0)
    {
        Mythreadtwo m1 = new Mythreadtwo();
        m1.start();
    }
    else{
        Mythreadthree m2 = new Mythreadthree();
        m2.start();
    }
   }
}
class Mythreadtwo extends Thread{
    public void run(){
        Mythreadone t1 = new Mythreadone();
        System.out.println(t1.r*t1.r);
    }
}
class Mythreadthree{
   public void run(){
    Mythreadone t2 = new Mythreadone();
            System.out.println(t2.r*t2.r);
  }
}

public class prac33 {
    public static void main(String[] args) {
        
    }
}
