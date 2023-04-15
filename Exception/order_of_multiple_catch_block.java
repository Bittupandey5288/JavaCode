package Exception;

import java.io.FileInputStream;

public class order_of_multiple_catch_block
{
    public static void main(String[] args)
    {
      try
      {
          System.out.println(100/0);
          FileInputStream s=new FileInputStream("D:/abc.txt");
      }
      catch(ArithmeticException e)
      {
          System.out.println(e);
      }
      catch (Exception e1)
      {
          System.out.println(e1);
      }

      //

    }
}
