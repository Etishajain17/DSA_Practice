package Day_1;

import java.util.HashMap;
import java.util.Scanner;

public class Vowel_repeated
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character, Integer> h = new HashMap<>();
        h.put('a',0);
        h.put('e',0);
        h.put('i',0);
        h.put('o',0);
        h.put('u',0);
        int i=0;
        while(i<str.length())
        {
            if(h.containsKey(str.charAt(i)))
            {
                h.replace(str.charAt(i),h.get(str.charAt(i))+1);
            }
            i++;
        }
        System.out.println(h);

    }
}
