package collectionframework;
import java.util.*;
public class Treesetdemo2
{
    public static void main(String[] args)
    {
        TreeSet t=new TreeSet();
        t.add(45);
        t.add(23);
        t.add(223);
        t.add(10);
        t.add(10);
        t.add(34567);
        t.add(1);
       // t.add("Hi"); not allowed
       // t.add(null); not allowed
        System.out.println(t);
        System.out.println("Tailset is : "+t.tailSet(45));
        System.out.println("Head set is : "+t.headSet(45));
        System.out.println("subset objecgt is : "+t.subSet(1,45));
    }
}
