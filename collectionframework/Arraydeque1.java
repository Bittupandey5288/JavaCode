package collectionframework;

import java.util.ArrayDeque;

public class Arraydeque1
{
    public static void main(String[] args)
    {
        ArrayDeque d=new ArrayDeque();
        d.add(12);
        d.add(5);
        d.add(3);
        d.add(7);
        d.add(7);
        d.add("Bj");
        //d.add(null);
        d.addFirst("bittu");
        d.addLast("sintu");
        System.out.println(d);
    }
}
