package Exception;

public class exceptionobject
{
    //class with main method
    public static void main(String[] args)
    {
        try{
            System.out.println(100/0);
        }
        catch(ArithmeticException e)
        {

           // System.out.println("code handled ======"+e);//first way
            //e.printStackTrace();//second way
            System.out.println(e.toString());//third way
        }

          System.out.println("normal termination");
    }
}
