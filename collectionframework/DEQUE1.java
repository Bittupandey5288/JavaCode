package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DEQUE1
{
    public static void main(String[] args)
    {
        Deque dq=new ArrayDeque();
        dq.add(122);
        dq.add(23);
        dq.add(45);
        dq.add(2);
        dq.add("boy");
        //dq.add(null);
        System.out.println(dq);
        dq.removeLast();
        System.out.println("remove last = :"+dq);
        System.out.println("remo first = "+dq.removeFirst());
        System.out.println(dq);
        dq.addFirst("404");
        System.out.println("add first is = :"+dq);
        dq.addLast(504);
        System.out.println("Add last is = : "+dq);
        System.out.println("get first is = :"+dq.getFirst());
        System.out.println("get Last is = :"+dq.getLast());
        System.out.println(dq.pop());
    }
}
