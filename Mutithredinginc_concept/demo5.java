package Mutithredinginc_concept;
class joincon extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class demo5
{
    public static void main(String[] args)throws InterruptedException
    {
        joincon t1=new joincon();
        t1.start();
        t1.join();
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
