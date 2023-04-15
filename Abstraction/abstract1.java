package Abstraction;

 abstract  class abstract1
{
        static int a=12;
       abstract public void language();
       abstract1()
       {
           System.out.println("hi i am constructor");
       }
      static public void method()
       {
           System.out.println("Hi i am static");
       }
}
class india extends abstract1
{
    public void language()
    {
        System.out.println("Mother language of the india is hindi");
        System.out.println("The value of the a is="+a);
    }
}
class france extends abstract1
{
    public void language()
    {
        System.out.println("mother language of the france is france");
    }
}
class Main
{
    public static void main(String[] args)
    {
        abstract1 obj=new india() ;
        obj.language();
        obj.method();
        abstract1 obj2= new france();
        obj2.language();
        obj2.method();
    }
}
//Note :--------- 1. we can create the constructor of the abstact clss in java
//:---------------2. we can create the staic variable and method in abstract class
//:---------------3.we can't create the object of the abstract class