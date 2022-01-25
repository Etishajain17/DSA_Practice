package Day_6;

import java.util.Scanner;

public class PrintNto1
{
    public static void print(int n)
    {
        if(n==0)
            return;
        System.out.print(n+" ");
        print(n-1);
    }
}
class main1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintNto1.print(n);
    }
}