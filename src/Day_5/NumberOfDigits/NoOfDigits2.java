package Day_5.NumberOfDigits;

import java.util.Scanner;

public class NoOfDigits2
{
    public void digits(int n,int s)
    {
        if(n<10)
        {
            System.out.println(s);
            return;
        }
        digits(n/10,s+1);
    }
}
class main2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NoOfDigits2 obj=new NoOfDigits2();
        obj.digits(n,1);
    }
}
