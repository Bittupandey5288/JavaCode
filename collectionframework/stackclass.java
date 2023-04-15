package collectionframework;

import java.util.Stack;

public class stackclass
{
    public static void main(String[] args)
    {
         Stack k=new Stack();
         k.push("Bablu");
         k.push(10);
         k.push("Banti");
         k.push(20);
         k.push("Bittu");
        System.out.println(k);
        System.out.println(k.indexOf("IndexOfBittu"+"Bittu"));
        System.out.println("Popping operation is "+k.pop());
        System.out.println(k.empty());
        //searching method
        System.out.println(k.search("Banti"));
    }
}

// note stack follows the Lifo structure