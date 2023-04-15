package collectionframework;

import java.util.TreeSet;

public class Treeset1
{
    public static void main(String[] args)
    {
        TreeSet t=new TreeSet();
        t.add(34);
        t.add(45);
        t.add(12);
        t.add(10);
        t.add(5);
        t.add(4);
        t.add(4);
        t.add(5);
       // t.add(null);
       // t.add("a");
        System.out.println(t);
        System.out.println("In Tree set data will be arranged in some sorting order ! in Accending order in decending order !");
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t);
        System.out.println(t.headSet(10));
        System.out.println("Tail set "+t.tailSet(10));
        System.out.println("Suset element "+t.subSet(5,34));
    }
}
