package Day_5.SumOfArrayElements;

import java.util.Scanner;

public class SumOfArray1
{
    public int sum1(int[] arr,int i)
    {
        if(arr.length==i)
        {
            return 0;
        }
        return arr[i]+sum1(arr,i+1);
    }
}
class main1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        SumOfArray1 obj=new SumOfArray1();
        System.out.println("Size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.sum1(arr,0));
    }
}