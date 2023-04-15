package Abstraction;


// whenever the action is common but implementation is different then used interface or abstract class



interface Bank1
{
      //int interset=9;
    public void rate_of_interest();

}
class sbi1 implements Bank1
{

    @Override
    public void rate_of_interest()
    {
        System.out.println("SBI rate of interest is = 4.6");
    }
}

class BOI2 implements Bank1
{
    @Override
    public void rate_of_interest()
    {
        System.out.println("The rate of interest of BOI is = 5.6");
    }
}

// class with main method

public class rateofinterset
{

    public static void main(String[] args)
    {
           sbi1 obj=new sbi1();
           obj.rate_of_interest();
           BOI2 obj2=new BOI2();
           obj2.rate_of_interest();
    }
}
