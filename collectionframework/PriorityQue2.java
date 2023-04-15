package collectionframework;

import java.util.PriorityQueue;

public class PriorityQue2
{
    public static void main(String[] args)
    {
        PriorityQueue q=new PriorityQueue();
        q.add(12);
        q.add(6);
        q.add(3);
        q.add(2);
        System.out.println(q);
        System.out.println("pooling operation  is = "+q.poll());
        System.out.println("After polling "+q);
        System.out.println("PriorityQue follow the fifo data structure due to Que interface in java ");
    }
}
