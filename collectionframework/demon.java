package collectionframework;

public class demon  extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Job of the child thread");
    }



    public static void main(String[] args)
    {
        System.out.println("Hi i am main thread");
        demon d=new demon();
        d.setPriority(2);
       // d.setDaemon(true);
        d.start();
    }
}
