package Day_5.XPowerN;

import java.util.Scanner;

public class XPowerN2
{
    public void power2(int x,int n,int p)
    {
        if(n==0)
        {
            System.out.println(p);
            return;
        }
        power2(x,n-1,p*x);
    }
}
class main2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        XPowerN2 obj=new XPowerN2();
        obj.power2(x,n,1);
    }
}