package Exception;

//
public class mutiplecatchblock
{

    public static void main(String[] args)
    {

            int []a=new int[4];
            try {
                System.out.println(100/0);
                System.out.println(a[5]);// this exception will be ignored
            }
            catch(ArithmeticException e)
            {
                System.out.println("first ........"+e);
                System.out.println();
            }
             catch (ArrayIndexOutOfBoundsException e1)
             {
                 System.out.println("second............"+e1);
             }

            System.out.println("normal termination");
    }
}
