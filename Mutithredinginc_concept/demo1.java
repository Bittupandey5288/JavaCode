package Mutithredinginc_concept;
class daemonth1 extends Thread
{
  public void run()
  {
      System.out.println();
      System.out.println("child Thread priority is = "+Thread.currentThread().getPriority());
  }
}
public class demo1
{
    public static void main(String[] args)
    {
        daemonth1 ob=new daemonth1();
        ob.setPriority(Thread.MAX_PRIORITY);
        ob.start();

        System.out.println(Thread.currentThread().getPriority());

    }
}
