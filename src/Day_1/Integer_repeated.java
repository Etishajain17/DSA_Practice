package Day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Integer_repeated {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, ArrayList> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i])) {
                h.get(arr[i]).add(i);
                //h.replace(arr[i],h.replace(arr[i],h.get(arr[i])));    // it is not required b'z reference passed
            } else {

                h.put(arr[i], new ArrayList(Arrays.asList(i)));
            }
        }
        System.out.println(h);
    }
}
