package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listinterfacemethod
{
    public static void main(String[] args)
    {
        LinkedList l2=new LinkedList();
        l2.add("bajrangbali");
        ArrayList l=new ArrayList(l2);
        l.add("Dog");
        l.add("Lion");
        l.add("Tiger");
        l.add("Elephant");
        l.add("Tiger");
        l.add(null);
        System.out.println(l);
        //1.intIndexOf()
        System.out.println("index of  elephant is = : "+l.indexOf("Elephant"));
        System.out.println("Last index of tiger is =: "+l.lastIndexOf("Tiger"));
        l.add(3,"baby");
        System.out.println("add element at specified index :"+l);
        l.set(3,"bablu");
        System.out.println("After setting the element at 3 index "+l);
        System.out.println(l.get(0));
    }
}
