package Mutithredinginc_concept;

public class mythraad1 extends Thread
{
    @Override//method because it is already present in Thrad class
    //run method defines the job of the Thread
    public void run()
    {
        //Task of the run method
        for(int i=0;i<=5;i++)
        {
          System.out.println(i);
        }
    }
    public void run(int a,int b)
    {
        System.out.println("The value of the a and b is="+ a+" "+b );
        //System.out.println("the value of the b is ="+b);
    }
}
class Thraddemo
{
    // main method
    public static void main(String[] args)
    {

        mythraad1 t=new mythraad1();
        t.start();//child thread will be start.
        t.run(6,7);
        for(int i=0;i<=5;i++)
        {
            System.out.println("m"+i);
        }
    }
}