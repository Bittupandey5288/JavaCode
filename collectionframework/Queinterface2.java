package collectionframework;


/*Que:-it is an interface which extends Collection interface this data strucutue is used
      to put data data according to some priority based and it follows the fifo (first in first out rule)

 */

/* Methods of the Que interface

 1.    boolean add(object):-	It is used to insert the specified element into this queue and return true upon success.
 2.    boolean offer(object):-	It is used to insert the specified element into this queue.
 3.    Object remove()	It is used to retrieves and removes the head of this queue.
 4.    Object poll()	It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
 5.    Object element()	It is used to retrieves, but does not remove, the head of this queue.
 6.    Object peek()	It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
Features o

 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queinterface2
{
    public static void main(String[] args)
    {
        PriorityQueue q=new PriorityQueue();
        System.out.println(q.add(15));
        System.out.println(q.add(1));
        q.add(5);
        q.add(3);
       // q.add("B");
        System.out.println("Before removing the elements "+q);
        System.out.println(q.poll());
        System.out.println(q);
        Queue e=new LinkedList();
        e.add(10);
        e.add(9);
        e.add(2);
        e.add("boy");
        e.add("null");
        e.offer("nk");
        System.out.println("Linked list object "+e);
        System.out.println(e.peek());
        System.out.println(e);
        LinkedList l=new LinkedList();
        l.offer("sa");
        l.offer(23);
        l.offer(67);
        l.offer(45);
        System.out.println("pure LinkedList object : "+l);
        System.out.println(l.poll());
        System.out.println("After removing : "+l);
    }
}
