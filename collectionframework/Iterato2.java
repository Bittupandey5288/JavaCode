package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterato2
{
    public static void main(String[] args)
    {
        ArrayList l=new ArrayList();
        for(int i=1;i<=10;i++)
        {
            l.add(i);
        }
        System.out.println("ArrayList object is +"+l);
        Iterator it=l.iterator();// iterator interface provide the facility of the removing of the element
        while(it.hasNext())
        {
            Integer i=(Integer) it.next();//typecasting
            if(i%2==0)
            {
                System.out.println(i);
            }
            else
            {
                it.remove();
                System.out.println("After removing the "+i);
            }
        }
    }
}
//note:- Iterator is the universal cursor: