package collectionframework;
import java.util.*;
public class cursorsdemo
{
    public static void main(String[] args)
    {
      Vector v=new Vector();
      for(int i=1;i<=10;i++)
      {
          v.addElement(i);
      }
        System.out.println("Vector objects are : "+v);

      Enumeration e=v.elements();
      while(e.hasMoreElements())
      {
          Integer I=(Integer)e.nextElement();// this is type casting:
          System.out.println(I);
          if(I%2==0)
          {
              System.out.println(I);
          }
          else
          {
              //e.remove(I); we cant performe remove operation by Enumeration
              System.out.println(v);
          }
      }

    }
}
