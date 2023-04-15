package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashsetdemo2
{
    public static void main(String[] args)
    {
        LinkedHashSet s=new LinkedHashSet(17);
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("C");
        s.add(1);
        s.add(null);
        s.add(null);
        System.out.println("Linked hashset object are objects are :"+s);


        //----------properties of the  Linkedhashset class---------- //
        /*
          1. underlying datastructure is hasstable +LinkedList
          2. duplicates not allowed
          3 .insertion order  preserved
          4. hetrogenious object are allowed
          5. only one null value is allowed
          6. it is intoduced in 1.4 version of the java
          7. Default initial capacity of the Hassset is 16
          8. it is the best choice if friquent operation is the search operation
          9. It does not implemets Random access interface in java.
         */

    }
}
