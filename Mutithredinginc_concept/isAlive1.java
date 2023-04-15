package Mutithredinginc_concept;

public class isAlive1 extends Thread
{

    public void run()
    {
        System.out.println("This is the child Thread" );
        System.out.println("in child :"+Thread.currentThread().isAlive());
    }
    public static void main(String a[])
    {
        isAlive1 t1=new isAlive1();
        System.out.println(t1.isAlive());// before starting a thread
        t1.start();
        System.out.println("This is the main Thread !");
    }
}

