package Mutithredinginc_concept;
class daemon extends Thread
{
  public void run()
  {
      if(Thread.currentThread().isDaemon())
      {
          System.out.println("Daemon thread");
      }
      else
      {
          System.out.println("Not daemon thread !");
      }
      System.out.println(Thread.currentThread().isDaemon());
     // System.out.println("Hi i am child thread !");
  }
}
public class demo2
{
    public static void main(String[] args)
    {
        System.out.println("Hi i am main thread !");
        daemon d1=new daemon();
        //d1.setDaemon(true);
        d1.start();
    }
}
