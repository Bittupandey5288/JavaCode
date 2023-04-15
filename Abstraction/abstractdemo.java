package Abstraction;

abstract class Atmcard
{
  int atm_no=5288;
  int bike_no;
  String mobile_no;
  static final int b=789;
   abstract void display();
   Atmcard(int bike_no,String mobile_no)
   {
       this.atm_no=atm_no;
       this.mobile_no=mobile_no;
       System.out.println("Constructor of the abstract class ");
   }

   public void dance()
   {
      // b=789;   we can not reassign final variable b
       System.out.println("This is the non abstract method of the abstract class ");
   }
}
public class abstractdemo extends Atmcard
{

    abstractdemo(int bike_no, String mobile_no)
    {
        super(bike_no, mobile_no);
    }

    public void display()
    {
        System.out.println("The atm no is ="+atm_no);
        System.out.println("static value is ="+b);
    }
    public static void main(String[] args)
    {
      Atmcard obj = new abstractdemo(6790,"345678");
      obj.display();
      obj.dance();
    }
}
