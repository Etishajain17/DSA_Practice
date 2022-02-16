package Day_9;

import java.util.Scanner;

class Node1
{
    String data;
    Node1 next;
    Node1(String data)
    {
        this.data=data;
    }
}
class QueueByLinkedList1
{
    Node1 front;
    Node1 rear;
    public void enqueue(String data)
    {
        Node1 n1=new Node1(data);
        if(front==null && rear==null)
        {
            front=rear=n1;
        }
        else
        {
            rear.next=n1;
            rear=n1;
        }
    }
}
public class StringModify2
{
    public static String modify2(String str)
    {
        String eve="",odd="";
        for (int i = 0; i <str.length() ; i++)
        {
            if(str.charAt(i)%2==0)
            {
                eve=eve+str.charAt(i);
            }
            else
            {
                odd=odd+str.charAt(i);
            }
        }
        return eve+odd;
    }
    public static void main(String[] args)
    {
        QueueByLinkedList1 q1=new QueueByLinkedList1();
        for (int i = 0; i < args.length; i++)
        {
            args[i]=modify2(args[i]);
            q1.enqueue(args[i]);
        }
    }
}
