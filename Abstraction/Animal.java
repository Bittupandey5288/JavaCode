package Abstraction;

// example of multiple inheritance through interface

interface Lion1  //super class for Animal
{
     void roaring();
    //by default compiler will add public  abstract
}
interface Dog1 // this is also supe class foe animal
{
    public abstract void barking();

}
public class Animal implements Lion1,Dog1
{
    // this method is overridden for Lion interface
    @Override
    public void roaring()
    {
        System.out.println("Lion always roar in the forest ");
    }
   // This method is overridden for Dog1 interface
    @Override
    public void barking()
    {
        System.out.println("dogs barks at night");
    }
    //class with main method

    public static void main(String[] args)
    {

        // object creation of the Animal class
        Animal obj=new Animal();
        obj.roaring();// method calling
        obj.barking();
    }
}
