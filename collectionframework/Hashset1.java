package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset1
{
    public static void main(String[] args)
    {

        HashSet s=new HashSet();
        s.add(21);
        s.add(4);
        s.add(10);
        s.add(1);
        s.add(1);
        s.add(null);
        s.add(null);
        s.add("A");
        System.out.println(s);
        LinkedHashSet s1=new LinkedHashSet();
        s1.add(21);
        s1.add(4);
        s1.add(10);
        s1.add(1);
        s1.add(1);
        s1.add(null);
        s1.add(null);
        s1.add("A");
        System.out.println(s1);
    }
}
