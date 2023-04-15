package collectionframework;

import java.util.*;

public class Linkedhashset1
{
    public static void main(String[] args)
    {
        /*note:- in Linkedhashset only insertion order is preserved although it is same as

            HashSet */

        LinkedHashSet s=new LinkedHashSet();
        s.add("Banti");
        s.add("Chiku");
        s.add(5);
        s.add("Cardiyologist");
        s.add(10);
        s.add(10);
        s.add(null);
        s.add(null);
        System.out.println("LinkedList object are :"+s);
        System.out.println("In Hasshset insertion order is no preserved  otherwise it is same as Linkedhasset!");
        HashSet h=new HashSet();
        h.add("Banti");
        h.add("Chiku");
        h.add(5);
        h.add("Cardiyologist");
        h.add(10);
        h.add(10);
        h.add(null);
        h.add(null);
        System.out.println("HashSet object are :"+h);




    }
}
