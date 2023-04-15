package Accessibility_control.java;

class demo2
{
 private int a=100;
 int b=200;
 protected int c=300;
 public int d=400;
}
public class samepackage
{
    public static void main(String[] args)
    {
        demo2 d=new demo2();
        //---------------- accisibility od feilds within a same package------//

       // System.out.println("private="+d.a); // private filelds not accessible within same package
        System.out.println("default="+d.b);
        System.out.println("protected="+d.c);
        System.out.println("public="+d.d);
    }
}
class c extends demo2
{
    public void display()
    {
        System.out.println(b);
        //System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}