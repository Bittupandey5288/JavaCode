package Abstraction;
abstract  class demo
{
    int a=200;
    public abstract void show();
    demo()
    {
        System.out.println("Hi i am abstract class constructor ! ");
        System.out.println(a);
    }
}
public class abstractcons extends demo
{
    @Override
    public void show()
    {

    }

    public static void main(String[] args)
    {
       demo o=new abstractcons();
    }
}
