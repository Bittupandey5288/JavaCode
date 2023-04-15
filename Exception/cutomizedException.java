package Exception;

class StudentMarks extends Exception
{
    //constructor
    StudentMarks( String s)
    {
        System.out.println(s);
    }
}
//class with main method
public class cutomizedException
{

    public void pass(int marks) throws StudentMarks
    {
        if(marks<33)
        {
            throw new StudentMarks("sorry! you are failed");
        }
        else
        {
            System.out.println("Congratulation you are passed !");
        }
    }

    public static void main(String[] args)
    {
        cutomizedException obj=new cutomizedException();
        try{
            obj.pass(12);
        }
        catch(Exception e)
        {

        }

    }
}
