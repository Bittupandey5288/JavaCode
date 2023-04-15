package Accessibility_control.java;

class demo
{
    private int a=100;
    int b=200;
    protected int c=300;
    public int d=400;

    //_________________within a same class----------//
    public void value()
    {
        System.out.println("private="+a);
        System.out.println("default="+b);
        System.out.println("Protected="+c);
        System.out.println("public="+d);
    }
    //-------------------End--------------//
}
//class with main method
public class withinclass
{
    public static void main(String[] args)
    {
        System.out.println("within a same class all  accesifier is accesible");
        demo d=new demo();
        d.value();
    }
}
