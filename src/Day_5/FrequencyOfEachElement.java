package Day_5;

import java.util.Scanner;

public class FrequencyOfEachElement
{
    public int freq(int[] arr,int currentindex,int search_value,int count)
    {
        if(arr.length==currentindex)
        {
            return count;
        }
        else if(arr[currentindex]!=search_value)
        {
            return freq(arr,currentindex+1,search_value,count);
        }
        else
        {
            return freq(arr,currentindex+1,search_value,count+1);
        }
    }
}
class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] arr2=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr2[i]=new FrequencyOfEachElement().freq(arr,0,arr[i],0);
            System.out.print(arr2[i]+" ");
        }
    }
}