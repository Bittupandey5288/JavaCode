package Mutithredinginc_concept;

public class Bank1 extends Thread
{
    static int bal=500;
    static int withdraw;
       //constructor
    Bank1(int withdraw)
    {
        this.withdraw=withdraw;
    }

    //---------------------------static synchonized class leve; lock.
    public static synchronized void Withdraw()
    {
      String name=Thread.currentThread().getName();
      if (withdraw<=bal)
      {
          System.out.println(name + "Withdraw money successfully!");
          bal=bal-withdraw;
      }
      else
      {
          System.out.println("Insufficient funds !");
      }
    }

    @Override
    public void run()
    {
        Withdraw();//method calling
    }
}
class customer extends Thread
{
    public static void main(String[] args)
    {
       Bank1 obj1=new Bank1(500);
       Thread t1=new Thread(obj1);
       Thread t2=new Thread(obj1);
       t1.setName("Bittu"); t2.setName("Pintu");
       t1.start();t2.start();
       Bank1 obj2=new Bank1(500);
       Thread t3=new Thread(obj2);
       Thread t4=new Thread(obj2);
       t3.setName("Sintu"); t4.setName("Chintu");
       t3.start(); t4.start();

    }
}