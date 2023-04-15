package collectionframework;

import java.util.Vector;

public class vectorclas
{
    public static void main(String[] args)
    {
        Vector v=new Vector();
        for(int i=1;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println(v);
        v.removeElementAt(0);
        System.out.println(v);
        System.out.println(v.lastElement());

    }
}
