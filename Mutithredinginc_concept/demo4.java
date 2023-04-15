package Mutithredinginc_concept;
class joinj extends Thread
{
    int n;
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for (int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}
public class demo4
{
    public static void main(String[] args)
    {
        joinj obj=new joinj(); //first Thread
        obj.setName("Thread 1");
        obj.n=5;
        obj.start();
        System.out.println();
        joinj obj2=new joinj();//second thread
        obj2.setName("Thread 2");
        obj2.n=10;
        obj2.start();//
        joinj obj3=new joinj();
        obj3.setName("Thread 3");
        obj3.n=100;
        obj3.start();
        try
        {
            obj3.join();
        }
        catch (Exception e)
        {

        }
    }
}
