package collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queinterface
{
    public static void main(String[] args)
    {
        PriorityQueue obj=new PriorityQueue();
       // obj.add("Abhisshek");
        //obj.add("kalu");
        //obj.add("manju");
        //obj.add("kalu");
       // obj.add("manju");
        obj.add(1);
        obj.add(2);
        obj.add(20);
        obj.add(10);
        System.out.println("Before removing : "+obj);
        obj.remove();
        System.out.println("After removing : "+obj);
       // obj.add(null);
        //obj.add(null);
        System.out.println(obj);
    }
}
