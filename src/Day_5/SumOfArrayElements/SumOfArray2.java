package Day_5.SumOfArrayElements;

import java.util.Scanner;

public class SumOfArray2
{
    public void sum2(int[] arr,int s,int i)
    {
        if(arr.length==i)
        {
            System.out.println(s);
            return;
        }
        sum2(arr,s+arr[i],i+1);
    }
}
class main2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        SumOfArray2 obj=new SumOfArray2();
        System.out.println("Size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.sum2(arr,0,0);
    }
}