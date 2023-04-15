package inheritance;

public class single
{
    int n=5;
    int fact=1;
    public void  fac()
    {
       for (int i=1;i<=n;i++)
       {
           fact=fact*i;
       }
        System.out.println(fact);
    }
}
class dd extends single
{
    public static void main(String[] args)
    {
        dd obj=new dd();
        obj.fac();//method calling
    }
}

