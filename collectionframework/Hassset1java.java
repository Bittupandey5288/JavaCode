package collectionframework;

import java.util.*;

public class Hassset1java
{
    public static void main(String args[])
    {
        Set s=new HashSet();
        s.add("Writometer");
        s.add("Fusion");
        s.add("Lacyier");
        s.add("Fusion");
        s.add("null");
        s.add("null");
        s.add("Likho phekho");
        System.out.println(s);



        // iterator method for List object/Hashset object


    }
}

/* note :- in Set interface only one null value is allwoed and duplicates value is not allowed.
           you can see in above code Fusion is duplicate but here is only one considrable
           and i have add two null value but only one is considrable.
 */



