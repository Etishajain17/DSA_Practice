package Day_5.PrintAllIndexes;

import java.util.Scanner;

public class PrintAllOccurencesIndexes2
{
    public static void res(int arr[], int currentindex, int search_value)
    {
        if(arr.length==currentindex)
        {
            return;
        }
        else if(arr[currentindex]==search_value)
        {
            System.out.print(currentindex+" ");
        }
        res(arr,currentindex+1,search_value);
    }
}
class main2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value to search");
        int x = sc.nextInt();
        PrintAllOccurencesIndexes2.res(arr, 0, x);
    }
}