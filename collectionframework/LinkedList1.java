package collectionframework;
import java.util.*;
public class LinkedList1
{
    public static void main(String[] args)
    {
        HashSet s=new HashSet();
        s.add(100);
       //  s.add(1,"bab");//
        LinkedList l=new LinkedList();
        l.add("pepsi");
        l.add("cocaa");
        l.add("sprit");
        l.add("thumsup");
        l.addFirst("mirinda");
        l.addLast("fizz");
        System.out.println(l);
        System.out.println("get first ="+l.getFirst());
        System.out.println("get last ="+l.getLast());
        l.removeFirst();
        System.out.println("Remove first = "+l);
        l.removeLast();
        System.out.println("Remove Last ="+l);
        System.out.println();
    }
}
