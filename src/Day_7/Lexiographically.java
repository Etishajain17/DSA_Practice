package Day_7;

import java.util.Scanner;

public class Lexiographically
{
    public static void order(int initial,int end)
    {
        if(initial>end)
            return;
        System.out.print(initial+" ");
        int i=0;
        if(initial==0)
            i=1;
        while(i<10)
        {
            order(initial * 10 + i, end);
            i++;
        }
    }
}
class main1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Lexiographically.order(sc.nextInt(),sc.nextInt());
    }
}