package inheritance;
class A1
{
    A1()
    {
        System.out.println("default constructor ");
    }
     A1(int c)
    {
        //this.display();
        this();
        System.out.println("Paramitrised constructor !");

    }
    public void display()
    {
        this.m2(); //focus here
        System.out.println();
    }
    public void m2()
    {
        System.out.println("M2 method calling !");
    }
}
public class thisconcept
{
    public static void main(String[] args)
    {
      A1 obj=new A1(200);
      obj.display();
    }
}
