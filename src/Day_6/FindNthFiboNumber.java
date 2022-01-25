package Day_6;

import java.util.Scanner;

public class FindNthFiboNumber
{
    public static int fiboOfN(int n)
    {
        if(n==0 || n==1)
            return n;
        return fiboOfN(n-1)+fiboOfN(n-2);
    }
}
class main3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(FindNthFiboNumber.fiboOfN(n-1));
    }
}