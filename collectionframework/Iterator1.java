package collectionframework;

import java.util.*;


/*Iterator is the universal cursor
2. In iterator only read and remove operation is possible
3. it can move in only forward direction.
 */

public class Iterator1
{
    public static void main(String[] args)
    {
     List l=new ArrayList();
     l.add("Niraj");
     l.add("Shubham");
     l.add("Banti ");
     l.add("Bablu");
     l.add("Dablu");
     l.add("Lalita");
     System.out.println("Before removal of the elements"+l);
     Iterator it=l.iterator();
     while(it.hasNext())
     {
         String s=(String) it.next();
         if(s.equals("Bablu"))
         {
             it.remove();
         }
     }
        System.out.println("After removing the ArryList object "+l);
    }
}
