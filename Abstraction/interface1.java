package Abstraction;
interface Bank
{
     int a=10; //:---------  //By default it is=public static final int a=10;
     void rate_of_intrest();//:--------   //By default it is public abstract rate_of_intrest();
}
class sbi implements Bank{
    public void rate_of_intrest()
    {
        System.out.println("The rate of the intrest of the  of sbi is = 7.6");
    }
}
class BOI implements Bank
{
    public void rate_of_intrest()
    {
        System.out.println("The rate of the intrest of the bank of india is = 6.6");
    }
}
public class interface1
{
    public static void main(String[] args)
    {
        sbi i=new sbi();
        i.rate_of_intrest();
        BOI I=new BOI();
        I.rate_of_intrest();
    }
}
