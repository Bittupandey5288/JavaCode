package collectionframework;

import java.util.ArrayDeque;

public class Arraydequedemo
{
    public static void main(String[] args)
    {

        ArrayDeque d=new ArrayDeque();
        d.add(23);
        d.add(20);
        d.add(20);
        d.add(10);
        d.add(21);
        d.add(2);
        d.add("A");
        d.addFirst(100);
        d.addLast(200);
        System.out.println("ArrayDeque objects : "+d);
        System.out.println("get first is = : "+d.getFirst());
        System.out.println("get last element=: "+d.getLast());
        //d.add(null);

    }
}
