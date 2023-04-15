package Exception;

public class userexception
{
    public static void main(String[] args)
    {
        System.out.println("main method ");
        try{
            throw new ArithmeticException();
        }
        catch (Exception e)
        {

        }
        System.out.println("normal termination ");
    }
}
