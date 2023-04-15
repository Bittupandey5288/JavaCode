package Mutithredinginc_concept;

import java.util.Scanner;

public class Myrunable implements Runnable
{
    int reverse=1;
    public void run()
    {
        int[] arr = new int[]{ 10, 20, 30, 40, 50 };
        for (int i=0;i<arr.length;i++)
        {

            if(arr[i]==3)
            {
                System.out.print(arr[i]+" ");
                //System.out.println();
                break;

            }
        }
        //int[] arr2 = new int[5]{ 10, 20, 30, 40, 50 };This prototype is only appicable in c# codding
        int number;
        System.out.println("enter you number for reverrse");
        Scanner obj=new Scanner(System .in);
        number=obj.nextInt();
        //while loop
        System.out.println("Original number is="+number);
        while(number>0)
        {
            //int reverse=1;
            int r= number%10;
            System.out.println(r);
            reverse=reverse*10+r;
            number=number/10;
        }
        System.out.println("After the reversing the number is=//"+reverse);
    }
}
class result
{
    // main method
    public static void main(String[] args)
    {
        Myrunable e= new Myrunable();
        Thread t=new Thread(e);
        t.start();
    }
}