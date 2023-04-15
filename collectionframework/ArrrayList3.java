package collectionframework;

import java.util.*;

public class ArrrayList3
{
    public static void main(String[] args)
    {
        List l=new ArrayList();
         l.add(12);
         l.add(10);
         l.add(12);
         l.add(null);
         l.add("mango");
         l.add(null);
        System.out.println("ArrayList object is : = "+l);

        List l2=new LinkedList();
        l2.add(12);
        l2.add(10);
        l2.add(12);
        l2.add(null);
        l2.add("mango");
        l2.add(null);
        System.out.println("LinkedList object is : = "+l2);

        List v=new Vector();
        v.add(12);
        v.add(10);
        v.add(12);
        v.add(null);
        v.add("mango");
        v.add(null);
        System.out.println("Vector  object is : = "+v);

        List k=new Stack();
        k.add(12);
        k.add(10);
        k.add(12);
        k.add(null);
        k.add("mango");
        k.add(null);
        System.out.println("Stack  object is : = "+k);



        /* note:-   In All List object here
                    1.insertion order is preserved
                    2.Hetrogenious object is allowed.
                    3.multiple null value is allowed
                    4.Duplicates are allowed.*/

    }
}
