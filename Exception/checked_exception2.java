package Exception;

import java.io.FileInputStream;

public class checked_exception2
{
    public static void main(String[] args)throws Exception
    {
        FileInputStream s=new FileInputStream("D:/abc.txt");//
        System.out.println("Normal termination");
    }
}
//This will give file not found exception so handled it by try and catch block and throes keyword in java