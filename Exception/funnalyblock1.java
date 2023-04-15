package Exception;

public class funnalyblock1
{
    // if any exception is in try block the what will be flow of control
    public static void main(String[] args)
    {
        try{

            System.out.println(1000/0);
            System.out.println("welcome");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("hi i am finally block in java");
        }
    }
}
