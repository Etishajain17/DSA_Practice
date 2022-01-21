package Day_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> arr =new ArrayList<>();
        //4,6,4,5,6,2;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }                                     //4  6 4  5 6  2
//        int p=1;                              //1  2                   //3   1 2 2
//        long s=0;
//        for(int i=1;i<n;i++)
//        {
//            if (arr.get(i - 1) > arr.get(i))
//            {
//                p++;
//                arr.set(i - 1, p);
//                s = s + p;
//                p--;
//            }
//            else
//            {
//                arr.set(i - 1, p);
//                s = s + p;
//                p=1;
//            }
//        }


        int score =arr.get(0);
        int sum=0;
        int count=1;
        for(int ele: arr)
        {
            if(ele>score)
            {
                count++;
            }
            else if(ele<=score)
            {
                count=1;                      //10 2 4 2 6 1 7 8 2 1
                                              //
                                              //   1 2 1 2 1 2 3 1 1
            }

            sum+=count;
            score=ele;
        }
        return sum;

        System.out.println(arr);
    }
}
