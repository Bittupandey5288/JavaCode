package collectionframework;

import java.util.*;

public class PriorityQue3
{
    public static void main(String[] args)
    {
        PriorityQueue pq=new PriorityQueue();
        pq.add(12);
        pq.add(3);
        pq.add(4);
        pq.add(25);// duplicates allowed
        pq.add(1);
        pq.add(25);
        //pq.add(null); null value not allowed
       // pq.add("Bittu");//hetroginious object not allowed.
        System.out.println(pq);
        // Methods of the Que interface

        pq.offer(100);
        pq.add(200);
        System.out.println("After adding the data in PriorityQue : "+pq);
        System.out.println("Polling the object "+pq.poll());
        System.out.println(pq);
        System.out.println("Removing the object : "+pq.remove());
        System.out.println(pq);
        System.out.println();

    }
}
