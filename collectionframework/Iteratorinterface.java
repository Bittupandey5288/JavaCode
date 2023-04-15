package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorinterface
{
    public static void main(String[] args)
    {
        ArrayList l=new ArrayList();
        for(int i=1;i<=5;i++)
        {
            l.add(i);
        }
        System.out.println(l);

        Iterator itr=l.iterator() ;
        {
            while(itr.hasNext())
            {
                Integer I=(Integer) itr.next();
                if(I%2==0)
                {
                   itr.remove();
                }
            }
            System.out.println("After removing Even number ArrayList object is  : "+l);
    }
}
}
