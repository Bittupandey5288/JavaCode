package collectionframework;
import java.util.*;
public class Pirirityque
{
    public static void main(String[] args)
    {

        PriorityQueue p=new PriorityQueue();
        p.add(45);
        p.add(24);
        p.add(34);
        System.out.println(p);
        System.out.println(p.peek());
        System.out.println("pool is = "+p.poll());

        System.out.println("----------------------");
        ArrayDeque d=new ArrayDeque();
        d.add("pummy");
        d.add("summy");
        d.add("kimmy");
        System.out.println(d);
        System.out.println(d.peek());
    }
}
