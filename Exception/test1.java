package Exception;
class invaildageage extends Exception
{
  invaildageage(String msg)
  {
      System.out.println(msg);
  }
}
public class test1
{

    public void vote(int age)
    {
        if(age<18)
        {
            try{
                throw new invaildageage("you are under age");
            }
            catch (Exception e)
            {

            }

        }
        else
        {
            System.out.println("You are eligible for voting !");
        }
    }
    public static void main(String[] args)
    {
        test1 obj=new test1();
        obj.vote(4);
    }
}
