package Day_4;

import java.util.Scanner;

public class TrailingZeroesInFactorial
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        //Time Complexity --> O(log n)
        System.out.println("Ënter the number : ");
        int n=sc.nextInt();
        int count=0;
        while(n>4)
        {
            count+=n/5;
            n/=5;
        }
        System.out.println( count     );
    }
}
