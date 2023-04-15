package collectionframework;
import java.util.*;
public class stackdemo
{
    public static void main(String[] args)
    {
        Stack k=new Stack();
        k.push(10);
        k.push(20);
        k.push(3);
        k.push(20);
        k.push("Hi");
        k.push(null);
        k.push(null);
        System.out.println("Stack class objects are given as "+k);
        /* properties of the stack class
         1.underlying datastructure is linear datastructure(LIFO order maintain :);
         2.Duplicate is allowed
         3.insertion order is preserved
         4.Multiple null vakue is allowed
         5.hetroginious object is allowed.
         */
          //--------- some methods of the stack class--------//
        System.out.println(k.pop());// it returns the top of element odf the stack
        System.out.println("After popping the  stack element are :  "+k);
        System.out.println("peek the element :"+k.peek());
        System.out.println("searching the element "+k.search("Hik"));
    }
}
