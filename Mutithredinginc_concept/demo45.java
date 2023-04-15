package Mutithredinginc_concept;

public class demo45
{
    public static void main(String[] args)
    {
        String str="Apple";
        //System.out.println(str[0]);
        int arr[]={12,34,45,56,67};
        for(int i=0;i<=arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            if(arr[i]==45)
            {
                break;
            }
        }
    }
}
