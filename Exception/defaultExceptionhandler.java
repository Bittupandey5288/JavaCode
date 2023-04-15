package Exception;

import MyPackage.ArithemeticException;

public class defaultExceptionhandler
{
    public static void main(String[] args)
    {
        System.out.println("welecome");
         defaultExceptionhandler obj=new defaultExceptionhandler();
         obj.Array();
         System.out.println("Abnormal termination");
    }
    // Array method
    public void Array()
    {
        int a = 10;
        int b = 0;
        System.out.println("kaise hain app sab");
        try
        {
            int c = a / b;//here Exception is occured
            System.out.println("The value of the c is =" + c);
        }
        catch(ArithmeticException ae)
        {

        }
    }
}//main method close
