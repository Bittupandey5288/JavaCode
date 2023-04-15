package Exception;

public class exceptionprop
{

    public void m1()
    {
        System.out.println("hi");
        System.out.println(100/0);
    }
    public void m2()
    {
        m1();
    }
    public void m3()
    {
        //handling code
        try{
            m2();
        }
          catch(Exception e)
         {
            System.out.println();
         }

    }
    //main method
    public static void main(String[] args)
    {
        exceptionprop obj=new exceptionprop(); //object of the class

        obj.m3();
        System.out.println("normal termination");
    }

}
//"------------------------------------------------------------------ "
//note :- in exception propgation you can handle code in any method 