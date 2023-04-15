package Exception;

public class demo44
{
    public static void main(String[] args)
    {
        int a[]=new int[4];
        System.out.println(a[6]);
        System.out.println("hi");
        System.out.println("hello");
        try{
            System.out.println(100/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("everyone");

    }
}
