package Day_5.SearchValue;

import java.util.Scanner;

public class SearchValue2
{
    public static int find2(int arr[ ], int startIndex,int lastindex, int search_value)
    {
        if(startIndex>lastindex)
        {
            return -1;
        }

        int mid = (startIndex+lastindex)/2;


        if(search_value < arr[mid])
        {
            return find2(arr,startIndex,mid-1,search_value);
        }
        else if(search_value>arr[mid])
        {
            return find2(arr,mid+1,lastindex,search_value);
        }
        else
        {
            if(mid==0 || arr[mid-1]!=arr[mid])
            {
                return mid;
            }
            else
            {
                return find2(arr,startIndex,mid-1,search_value);
            }
        }
    }
}
class main2
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
        System.out.println(SearchValue2.find2(arr,0,arr.length-1,x));
    }
}