package Exception;

public class multitrycatchblock
{
    public static void main(String[] args)
    {
       int a[]=new int [4];
       //
       try
       {

           System.out.println("hi");
           System.out.println("hello");
           System.out.println(a[6]);
           System.out.println("how are you");
           System.out.println("kuch nahi karega");        //this all code will be ignored due to firs exception.
           System.out.println(100/0);
           System.out.println("jai mata di");
       }
        //System.out.println("hell");
        catch(ArithmeticException e1)
       {
           System.out.println("ArithmeticException handling code ="+e1);
       }
       catch(ArrayIndexOutOfBoundsException e2)
       {
           System.out.println("ArrayIndexOutOfBouundException ="+e2);
       }
       catch(Exception e3)
        {
            System.out.println(e3);

        }
        System.out.println("rest code ");
    }
}
