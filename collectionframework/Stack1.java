package collectionframework;
import java.util.Stack;
public class Stack1
{

    public static void main(String[] args)
    {


        Stack s=new Stack();
        s.push(10);
        s.push(5);
        s.push("Bittu");
        s.push(null);
        s.push(null);
        s.push("100");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println("After popping : "+s);
        // 1. empty method
        System.out.println(s.empty());
        //2. peek method()

        System.out.println("peek = "+s.peek());
        //3.search method()
        System.out.println(s.search("Bittu"));
    }
}
