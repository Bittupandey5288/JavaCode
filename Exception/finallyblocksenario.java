package Exception;

public class finallyblocksenario
{
    public static void main(String[] args)
    {
        int a=100;
        int b=200;
        //1 . if Exception in try block then
        System.out.println("-------------if Exception in try block then ! --------------");
        try
        {

            System.out.println(a/0);
            System.out.println("Hi i am try block ");
        }
        catch (Exception e)
        {
            System.out.println("hi i am catch block ");
        }
        finally
        {
            System.out.println("hi i am finally block ");
        }
        //2. if Exception not in try block then
        System.out.println("---------------if Exception not in finally block then!------------");
        try
        {

            System.out.println(b/2);
            System.out.println("Hi i am try block ");
        }
        catch (Exception e)
        {
            System.out.println("hi i am catch block ");
        }
        finally
        {
            System.out.println("hi i am finally block ");
        }
        System.out.println("---------------if Exception is also ion catch block then ! ");


        try
        {

            System.out.println(a/0);
            System.out.println("Hi i am try block ");
        }
        catch (Exception e)
        {
            int c=200;
            int d=400;
            System.out.println("hi i am catch block ");
            System.out.println("sum in catch block ="+(c+d));
            try {
                System.out.println(b/0);
            }
            catch (Exception e1)
            {

            }
            System.out.println("normal flow of catch block !");
        }
        finally
        {
            try{

            }
            catch (Exception e2)
            {
                System.out.println(a/0);
            }
            System.out.println("hi i am finally block ");

            System.out.println("normal flow in finally block");
        }
    }
}
