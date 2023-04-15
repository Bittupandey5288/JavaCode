package collectionframework;

import java.util.ArrayList;
import java.util.Vector;

public class Vectorclass
{
    public static void main(String[] args)
    {
        ArrayList l=new ArrayList();
        l.add(100);
        l.add(200);
        l.add(300);
        // vector class
        Vector v=new Vector();
        v.addElement(null);
        v.addElement(null);
        v.addElement(1);
        v.addElement(2);
        v.addElement(2);
        System.out.println(v);
        v.removeElement(null);
        System.out.println(v);
        v.removeElementAt(3);
        System.out.println(v);
        v.addAll(l);
        System.out.println(v);
        System.out.println("------------------------------");
        //v.removeAllElements();
        System.out.println(v.firstElement());
        System.out.println(v.capacity());
    }
}
