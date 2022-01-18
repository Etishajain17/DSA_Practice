package Day_3;

import java.util.Scanner;

/*
There is a company that manufactures three types of products. In this company, there are 5 salesmen. Each salesman is supposed to sell three products. Write a program to print

(i) The total no of sales by each salesman and

(ii) total sales of each item.

 */
class Company
{
    public int[] products;
    Company(int[] products)
    {
        this.products=products;
    }
}
public class SalesofMan
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Company[] salesman = new Company[5];
        for (int i = 0; i < salesman.length; i++)
        {
            System.out.println("Enter the sales of 3 items sold by salesman "+(i+1)+":");
            salesman[i]=new Company(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()});
        }
        int[] sum1=new int[salesman.length];
        int[] sum2=new int[salesman[salesman.length-1].products.length];
        for (int i = 0; i < salesman.length; i++)
        {
            for (int j = 0; j < salesman[i].products.length; j++)
            {
                sum1[i]=sum1[i]+ salesman[i].products[j];
                sum2[j]=sum2[j]+salesman[i].products[j];
            }
        }
        for (int i = 0; i < sum1.length; i++)
        {
            System.out.println("Total Sales By Salesman "+(i+1)+" ="+sum1[i]);
        }
        for (int i = 0; i < sum2.length; i++)
        {
            System.out.println("Total sales of item "+(i+1)+" ="+sum2[i]);
        }
    }

}
