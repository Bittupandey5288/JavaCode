package collectionframework;
import java.util.*;
public class Hasshsetdemo2
{
    public static void main(String[] args)
    {
       HashSet s=new HashSet(17);
       s.add("A");
       s.add("B");
       s.add("C");
       s.add("C");
       s.add(1);
       s.add(null);
       s.add(null);
       System.out.println("Hasshset objects are :"+s);


       //----------properties of the  Hasshset class---------- //
        /*
          1. underlying datastructure is hasstable
          2. duplicates not allowed
          3 .insertion order not preserved
          4. hetriginious object are allowed
          5. only one null value is allowed
          6. it is intoduced in 1.2 version of the java
          7. Default initial capacity of the Hassset is 16
          8. it is the best choice if friquent operation is the search operation
          9.It does not implemets Random access interface in java.
         */


    }
}
