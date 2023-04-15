package Exception;

import java.io.FileInputStream;

public class demo

{
    public static void main(String[] args) throws Exception
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
}
