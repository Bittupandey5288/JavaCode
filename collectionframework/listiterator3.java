package collectionframework;

import java.util.LinkedList;
import java.util.ListIterator;

public class listiterator3
{
    public static void main(String[] args)
    {
       LinkedList l=new LinkedList();
       for(int i=1;i<=10;i++)
       {
           l.add(i);
       }
        System.out.println("LinkedList object are :"+l);

        ListIterator lt=l.listIterator();
        //----------------in forward direction----------//
        while(lt.hasNext())
        {
            System.out.println(lt.next());
        }
        System.out.println("In backward direction :");
        while(lt.hasPrevious())
        {
           // System.out.println(lt.previous());
            Integer i=(Integer) lt.previous();
            System.out.println(i);
            if(i==10)
            {
                lt.set(100);
                System.out.println(i);
            }
        }
    }
}
