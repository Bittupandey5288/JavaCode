package Mutithredinginc_concept;

public class joinmethod extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }

    }
}
class result3
{
    //class with main method
    public static void main(String[] args)
    {
        joinmethod t1=new joinmethod();
        joinmethod t2=new joinmethod();
        joinmethod t3=new joinmethod();
        t1.setName("my thread1");
        t2.setName("my thread2 ");
        t3.setName("my thread3");
        t1.start();
        t2.start();
         try {
             t2.join();
         }catch (Exception e)
         {
             System.out.println(e);
         }
         t3.start();
    }
}