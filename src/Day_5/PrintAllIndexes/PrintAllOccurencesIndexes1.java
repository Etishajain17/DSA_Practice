package Day_5.PrintAllIndexes;

import java.util.Scanner;

public class PrintAllOccurencesIndexes1
{
    public static int[] res(int arr[], int currentindex, int search_value,int arr2[],int j)
    {
        if(arr.length==currentindex)
        {
            return arr2;
        }
        else if(arr[currentindex]==search_value)
        {
            arr2[j]=currentindex;
            j=j+1;
        }
        return res(arr,currentindex+1,search_value,arr2,j);
    }
}
class main1
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
        System.out.println("Enter value to search");
        int x=sc.nextInt();
        int[] arr2=new int[n];
        for (int i = 0; i < arr2.length; i++)
        {
            arr2[i]=-1;
        }
        arr2= PrintAllOccurencesIndexes1.res(arr,0,x,arr2,0);
        for (int i = 0; i < arr2.length; i++)
        {
            if(arr2[i]!=-1)
            {
                System.out.print(arr2[i]+" ");
            }
        }
    }
}