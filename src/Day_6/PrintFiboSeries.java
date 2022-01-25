package Day_6;

import java.util.Scanner;

public class PrintFiboSeries
{
    public static void fibo(int n,int a,int b)
    {
        if(n<0)
            return;
        System.out.print(a + b + " ");
        fibo(n - 1, b, a + b);
    }
}
class main2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
            System.out.println(0);
        else if(n>1)
        {
            System.out.print(0 + " " + 1 + " ");
            PrintFiboSeries.fibo(n - 3, 0, 1);
        }

    }
}