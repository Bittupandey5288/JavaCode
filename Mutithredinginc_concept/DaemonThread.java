package Mutithredinginc_concept;

public class DaemonThread extends Thread
{
    @Override
    //job of the run method
    public void run()
    {
        System.out.println("run");
       // System.out.println(Thread.currentThread().isDaemon());
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("It is a daemon thread in java");
        }
        else{
            System.out.println("child Thread");
        }
    }
    //main method
    public static void main(String[] args)
    {
        //Thread.currentThread().isDaemon();
        System.out.println("main thread in java");
        DaemonThread t1=new DaemonThread();
        t1.start();
        //----------------first set Daemon Thread then ------------//
             //starts the Thread otherwise you will get Exception
        t1.setDaemon(true);
    }
}
