package Day_5.SearchValue;

import java.util.Scanner;

public class SearchValue1
{
    public static int find1(int arr[ ], int currentIndex, int search_value)
    {
        if(currentIndex==arr.length)
        {
            return -1;
        }
        else if(search_value==arr[currentIndex])
        {
            return currentIndex;
        }
        return find1(arr,currentIndex+1,search_value);
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
        System.out.println(SearchValue1.find1(arr,0,x));
    }
}