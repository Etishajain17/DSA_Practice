package Day_5.Print1ToN;

import java.util.Scanner;

public class Print1toN1
{
    public void print1(int n)
    {
        if(n==0)
        {
            return;
        }
        print1(n-1);
        System.out.print(n+" ");
    }
}
class main1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Print1toN1 obj=new Print1toN1();
        obj.print1(n);
    }
}