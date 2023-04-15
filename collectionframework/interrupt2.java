package collectionframework;

public class interrupt2 extends Thread
{

    @Override
    public void run()
    {
        try
            {
                System.out.println(Thread.interrupted());//interrupted method will cahnge the interrupted status
                for(int i=1;i<=5;i++)
                {
                    System.out.println("Job of the Thread !");
                    //System.out.println(Thread.currentThread().isInterrupted());
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    public static void main(String[] args)
    {
        interrupt2 obj=new interrupt2();
        obj.start();
        obj.interrupt();
        //System.out.println(obj.isInterrupted());
        System.out.println("Hi i am main method :");
    }
}
