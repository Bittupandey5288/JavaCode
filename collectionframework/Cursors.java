package collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Cursors
{
    public static void main(String[] args)
    {
      Vector v=new Vector();
      for(int i=1;i<10;i++)
      {
          v.add(i);
      }
        System.out.println("Vector elements is "+v);


        Enumeration itr=v.elements();
        while(itr.hasMoreElements())
        {

            System.out.println(itr.nextElement());
            try{
                Thread.sleep(2000);
            }
            catch ( Exception e)
            {
                System.out.println(e);
            }
        }
        Stack s1=new Stack();
        s1.push("A");
        s1.push("B");
        s1.push("c");
        s1.push(2);
        System.out.println("Stack object is = "+s1);
        //ListIterator interface

        Iterator itr1=s1.iterator();

        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
            try{
                Thread.sleep(3000);
            }
            catch ( Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
