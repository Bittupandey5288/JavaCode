package Exception;

public class voting
{

    public void  age(int age1) throws InvalidAgeException
    {
        if(age1<=18)
        {
            throw new InvalidAgeException("You are note elogible for votiog");
        }
        else
        {
            System.out.println("you are eligible for voting");
        }
    }
    public static void main(String[] args) throws InvalidAgeException {
       voting g=new voting();
       g.age(20);
    }
}
//-----------------------------------Invalid age Exception class ---------------------------------//


class InvalidAgeException extends Exception
{
    InvalidAgeException( String s)
    {
        System.out.println(s);
    }
}