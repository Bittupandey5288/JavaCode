package Mutithredinginc_concept;


class passenger
{
    int totaltticket=10;

    public synchronized void book(int no_of_ticket) //
    {
        if(no_of_ticket<=totaltticket)
        {
            System.out.println(Thread.currentThread().getName()+" Booked ticket successfully");
            totaltticket=totaltticket-no_of_ticket;
            System.out.println("Remaing tickets are  "+totaltticket);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+ "can't booked ticket !");
            System.out.println("Ticket is not avilable !");
        }
    }
}
public class Busticketapp extends  Thread
{
   static passenger p;// refrence variable of the passenger clas
    int value;// instance variable of the class
      public void run()
      {
         p.book(value);
      }
    public static void main(String[] args)
    {
        p=new passenger();
        Busticketapp t1=new Busticketapp();
        t1.setName("Bittu");
        t1.value=5;
        t1.start();
        Busticketapp t2=new Busticketapp();
        t2.setName("Pintu");
        t2.value=5;
        t2.start();
        Busticketapp t3=new Busticketapp();
        t3.setName("Rinkoo");
        t3.value=2;
        t3.start();
    }
}
