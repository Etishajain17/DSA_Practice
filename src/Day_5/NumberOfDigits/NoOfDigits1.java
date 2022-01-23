package Day_5.NumberOfDigits;

import java.util.Scanner;

public class NoOfDigits1
{
    public int digits(int n)
    {
        if(n<9)
        {
            return 1;
        }
        return 1+digits(n/10);
    }
}
class main1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NoOfDigits1 obj=new NoOfDigits1();
        System.out.println(obj.digits(n));
    }
}