package Day_6;

import java.util.Scanner;

public class SubsequencesOfString
{
    public static void str(String s)
    {
        if(s.length()==0)
        {
            System.out.println(" ");
            return;
        }
        System.out.println(s.charAt(0));
        str(s.substring(1));
        if(s.length()!=1)
            System.out.println(s);
    }
}
class main4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        SubsequencesOfString.str(s);
    }
}