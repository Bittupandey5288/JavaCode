package Abstraction;
//-------------------------------------------------------//
class other
{

}
/*interface B implements other
{
  note:- iska matlab yah hai ki interface kisi class ko implements ya extends nhi kar sakta hai
           but interface ko implements dusre class ke help sekiya ja saktha hai
} */
//-------------------------------------------------------//
interface A
{
    public static final int age=34;
    public abstract void display();
}
class show implements A
{
    @Override
    public void display()
    {
        System.out.println("The age of the person is ="+age);
    }
}

public class interfacedemo
{
    //object creation of the child class

    public static void main(String[] args)
    {
        show ob=new show();
        ob.display();// display method will be called
    }
}
