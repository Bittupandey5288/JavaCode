package Mutithredinginc_concept;

public class interrrupt1 extends Thread
{
    @Override
    public void run()
    {
        try
        {
            for (int i=1;i<=5;i++)
            {
                System.out.println(Thread.currentThread().isInterrupted());
                System.out.println("child thread :");
                Thread.sleep(2000);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
    }

    public static void main(String[] args)
    {
        interrrupt1 ob=new interrrupt1();
        ob.start();
        ob.interrupt();
    }
}
