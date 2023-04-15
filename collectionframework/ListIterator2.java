package collectionframework;
import java.util.*;
public class ListIterator2
{
    public static void main(String[] args)
    {
        ArrayList l=new ArrayList();

        for(int i=1;i<=6;i++)
        {
            l.add(i);
        }

        System.out.println("ListIterator object is "+l);

       // ListIterator interface

        ListIterator it=l.listIterator();
        while(it.hasNext())
        {
            // Warpper class concept
            Integer I=(Integer) it.next();

            System.out.println(I);

            // Remove operation
            if(I==2)
            {
                // 2 will be removed
                it.remove();
            }

            //
            //
            // Replacing operation
            if(I==6)
            {
                it.set(600);
            }
            // Write operation or Add operation
            if(I==4)
            {
                it.add(400);
            }
        }

        System.out.println("After all activities "+l);
        // for backwardDirection print object
        /*while(it.hasPrevious())
        {
            //System.out.println(it.previous());
            System.out.println(it.previous());
        }*/
    }
}
