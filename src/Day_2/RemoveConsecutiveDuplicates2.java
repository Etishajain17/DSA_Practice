package Day_2;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

public class RemoveConsecutiveDuplicates2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        //Iterator i=ar.iterator();
        int c=1;
        while(true)
        {
            System.out.println("if you want to enter element press 1 else press 0");
            c=sc.nextInt();
            if(c==0)
            {
                break;
            }
            ar.add(sc.nextInt());
        }
        for (int i = 0; i < ar.size(); i++)
        {
            System.out.println(ar.get(i));
        }
    }
}