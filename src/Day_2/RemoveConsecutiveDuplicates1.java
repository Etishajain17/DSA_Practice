package Day_2;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.print("enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int s=1;
        int i=0;
        for (i = 1; i < arr.length ; i++)
        {
            if(arr[i-1] != arr[i])
            {
                 arr[s]=arr[i];
                 s++;
            }
        }
        for (i = 0; i < s; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
