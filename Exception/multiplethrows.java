package Exception;

import java.io.*;
public class multiplethrows
{

//-----------------------------------Throws multiple checked Exception to the jvm-------------------//
    public static void main(String[] args) throws FileNotFoundException ,InterruptedException  {
        FileInputStream st=new FileInputStream("abc.txt"); //Exception 1
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);

                Thread.sleep(2000); // Exception 2
        }
        System.out.println("normal termination ");
    }
}
