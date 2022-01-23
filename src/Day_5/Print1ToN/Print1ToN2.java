package Day_5.Print1ToN;

import java.util.Scanner;

public class Print1ToN2
{
    public void print2(int n,int i)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(i+" ");
        print2(n-1,i+1);
    }
}
class main2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print1ToN2 obj = new Print1ToN2();
        obj.print2(n,1);
    }
}