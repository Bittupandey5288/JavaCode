package Exception;

public class finnaly2
{
    public static void main(String[] args)
    {
        // if no any exception is in try block
        try
        {
            System.out.println("hi i m try block");
        }
        catch(Exception e)
        {
            System.out.println("handling code");
        }
        finally
        {
            System.out.println("hi i am finnaly block");
        }
    }
}
