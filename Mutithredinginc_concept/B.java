package Mutithredinginc_concept;

public class B extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Hi am child thread ");
        for (int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class other
{
    public static void main(String[] args)
    {
        B obj=new B();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setName("Bittu");t2.setName("Pintu");
        t1.start(); t2.start();
    }
}
