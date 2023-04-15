package Exception;

public class finally3
{
    public static void main(String[] args)
    {
        /* Here exception is also in catch block then only try block and finnaly block will be occured*/
        try
        {
            System.out.println("welocome");
           // System.out.println();
            System.out.println(100/0);
            System.out.println("hi i m try block");
        }
        catch(Exception e)
        {
            System.out.println(200/0);

            System.out.println("helllo i  am catch containing also a exception");
            System.out.println("sdfghjk");
            System.out.println("asdfghjkl");

        }
        finally
        {
            int b[]=new int[5];
            //System.out.println(b[10]);
            System.out.println("hi i am finnaly block bitt");
        }
        System.out.println("normal termination");
    }

}
