package collectionframework;

import java.util.ArrayList;

public class ListMethod
{
    public static void main(String[] args)
    {
        ArrayList l=new ArrayList();
        l.add("bablu");
        l.add("dablu");
        l.add("banti");
        l.add("rakhi");
        l.add("bittu");
        System.out.println(l);
        System.out.println(l.size());
        l.add(2,"Vikash");
        System.out.println(l);
        System.out.println(l.get(2));
        System.out.println(l.remove(2));
        System.out.println("After removing the element :"+l);
        l.set(0,"nulla man");
        System.out.println("After null setting :"+l);
    }
}
