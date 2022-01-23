package Day_5.XPowerN;

import java.util.Scanner;

public class XPowerN1
{
    public int power1(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x * power1(x,n-1);
    }
}
class main1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        XPowerN1 obj=new XPowerN1();
        System.out.println(obj.power1(x,n));
    }
}