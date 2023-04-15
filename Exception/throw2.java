package Exception;

public class throw2
{
    public void div(int a,int b)
    {
        if(b==0)
        {
           throw new ArithmeticException();
        }
        else
        {
            int c=a/b;
            System.out.println();
        }
    }
    //main method
    public static void main(String[] args)
    {
            throw2 obj=new throw2();
            obj.div(12,0);
    }
}
