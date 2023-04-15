package collectionframework;
import java.util.*;
public class Setobjects
{
    public static void main(String[] args)
    {
        Set s=new HashSet();
        s.add(23);
        s.add(4);
        s.add(2);
        s.add(2);
        s.add(null);
        s.add("mango");
        s.add(null);
        System.out.println("HashSet object is : ="+s);


        Set s1=new LinkedHashSet();
        s1.add(23);
        s1.add(4);
        s1.add(2);
        s1.add(2);
        s1.add(null);
        s1.add("mango");
        s1.add(null);
        System.out.println("In LinkedHash set insertion order is preserved :");


        System.out.println("Linked HashSet  Set object is : ="+s1);
        System.out.println("---------------------------------------");

        SortedSet s2=new TreeSet();
        s2.add(23);
        s2.add(4);
        s2.add(2);
        s2.add(2);
       // s2.add("mango");
       // s2.add(null);
        System.out.println("Tree set object is : ="+s2);
        System.out.println("normal termination");
    }
}
