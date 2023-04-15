package Exception;

public class nestedtry2
{
    public static void main(String[] args)
    {
        // outer try block
        try{
            System.out.println("hi");
            System.out.println(10/0); //here this line is producing Exception

            System.out.println("igone line of code");
            //inner try block
            try
            {
                System.out.println("hello");
                System.out.println("by");
                System.out.println(100/0);// here this line is producing Exception
                System.out.println("ignore line of code second");
            }
            //catch block for inner try block
            catch(ArithmeticException ae)
            {

            }
        }
        // catch block for outer try block
        catch(Exception e)
        {
            System.out.println("outer catch block");

        }
        System.out.println("rest code");

    }
}
