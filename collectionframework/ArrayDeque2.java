package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque2
{
    public static void main(String[] args)
    {

        Deque d=new ArrayDeque();
        d.add(12);
        d.add(12);
        //d.add(null);
        d.add(5);
        d.add("Ghing");
        System.out.println(d);
    }
}
