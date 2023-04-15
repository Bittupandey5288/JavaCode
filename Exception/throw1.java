package Exception;

public class throw1
{
    public void method() throws InterruptedException
    {

        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            Thread.sleep(2000);// here this checked Exception will be occured throws keyword is used to throw Exception to the caller method
        }
    }
    //class with main method
    public static void main(String[] args) throws InterruptedException
    {
        throw1 obj=new throw1();
        obj.method();
        System.out.println("normal termination");
    }
}
