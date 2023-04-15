package Exception;

public class checked_exception
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            //Thread.sleep(2000);//this is   risky code it is mandatory to handle by try catch block and by throws key words
            System.out.println("normal termination");
        }
    }
}
