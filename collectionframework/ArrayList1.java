package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList1
{
    public static void main(String[] args)
    {
        ArrayList l=new ArrayList();
        l.add("fusion");
        l.add("Writometere");
        l.add("likhophko");
        System.out.println(l);
        // Anther collection object

        LinkedList lk=new LinkedList();
        lk.add("Sprit");
        lk.add("Pepsi");
        lk.add("Limca");
        System.out.println("LinkedList objects are : "+lk);

        //method s of collection interface

        //1.addAll
        l.addAll(lk);
        System.out.println(l);

        //2.remove
        l.remove("Limca");
        System.out.println("After removing Limca "+l);
        //l.removeAll(lk);
        System.out.println("After removing all LinkedList object " +l);
        l.clear();
        System.out.println("After clearing : "+l);

        System.out.println("contains method :"+lk.contains("Pepsoi"));




        //---------------------------for ContainsAll method()----------------------


        ArrayList l2=new ArrayList();
        l2.add("Bittu ");
        l2.add("sintu");


        ArrayList l3=new ArrayList();
        l3.add("Amit");
        l3.add("sumit");

        l2.addAll(l3);

        System.out.println("ContainsAll check :"+l2.containsAll(l2));
        System.out.println("isempty method check :"+l2.isEmpty());
        System.out.println("size of the l2 object "+l2.size());
        System.out.println(l2);

    }
}
