package collectionframework;

import java.util.PriorityQueue;

public class Priorityquedemo
{

    public static void main(String[] args)
    {
        PriorityQueue p=new PriorityQueue();
        p.add(12);
        p.add(5);
        p.add(123);
        p.add(30);
        p.add(100);
        p.add(100);
        p.add(3);
        p.offer(45);
        System.out.println(p);

        //-------------------peek()---------------
        System.out.println(p.peek());// This method will first element of he Priorityue not permanently
        System.out.println("After peeking the element "+p);
        System.out.println("First element of the PriorityQueue "+p.element());
        System.out.println(p);
        //----------------------pool methods----------
        // note data will be inserted accoundind some priority by default
        // but data will be removed according to some order you can see below

        System.out.println("Polling the element : "+p.poll());
        System.out.println("Polling the element : "+p.poll());
        System.out.println("Polling the element : "+p.poll());
        System.out.println("Polling the element : "+p.poll());
        System.out.println("Polling the element : "+p.poll());
        System.out.println("Polling the element : "+p.poll());
       /* System.out.println(p.remove());
        System.out.println(p.remove());
        System.out.println(p.remove());
        System.out.println(p.remove());
        System.out.println(p.remove());
        System.out.println(p.remove());*/
        System.out.println("After removing all elments" + p);
    }
}
