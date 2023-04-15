package Exception;
class men extends Exception
{

    men(String s)
    {
        System.out.println(s);
    }
}
public class oldagepantion
{
 public void year(int age)
 {
   if(age>60)
   {
       System.out.println("you are fit for pantion !");
   }
   else
     {
         try {
             throw new men("you are not eligible for pantion !") ;
         }
         catch (Exception e)
         {

         }

     }
 }
    public static void main(String[] args)
    {
        oldagepantion obj=new oldagepantion();
        obj.year(45);

    }
}
