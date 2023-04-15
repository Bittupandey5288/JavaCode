package Mutithredinginc_concept;

public class A extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args)
    {
        A ob=new A();
        Thread t1=new Thread(ob);
        t1.start();
        //t1.setName("Bittu");
        Thread t2=new Thread(ob);
        t2.start();
        //t2.setName("Pintu");
    }
}
