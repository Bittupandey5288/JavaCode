package collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Prioriyque1
{
    public static void main(String[] args)
    {
        Queue p=new PriorityQueue();
        p.add(12);
        p.add(10);
        p.add(12);
        p.add(13);
        p.add(1);
        p.offer(3);
        //p.add("hi");
       // p.add(null);
        System.out.println(p);
        System.out.println(p.peek());
        p.remove();
        System.out.println(p);
        p.poll();
        System.out.println("Polling statement : "+p);
        System.out.println(p.element());
        System.out.println(p);
    }
}
