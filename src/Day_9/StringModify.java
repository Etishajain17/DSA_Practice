package Day_9;

class Node
{
    String data;
    Node next;
    Node(String data)
    {
        this.data=data;
    }
}
class QueueByLinkedList
{
    Node front;
    Node rear;
    public void enqueue(String data)
    {
        Node n1=new Node(data);
        if(front==null && rear==null)
        {
            front=rear=n1;
        }
        else
        {
            rear.next=n1;
            rear=n1;
        }
        return;
    }
}
public class StringModify
{
    public static String modify(String str)
    {
        String str2;
        if(str.charAt(0)=='-')
        {
            str2="N";
        }
        else if(str.charAt(0)!=48)
        {
            if(str.charAt(0)%2==0)
            {
                str2="Pe";
            }
            else
            {
                str2="Po";
            }
        }
        else
        {
            str2="P";
        }
        int k=0;
        for (int i = 1; i < str.length(); i++)
        {
            if(k==0 && str.charAt(i)=='0')
            {
                continue;
            }
            else
            {
                k=1;
                if(str.charAt(i)=='0')
                {
                    str2=str2+"Z";
                }
                else if(str.charAt(i)%2==0)
                {
                    str2=str2+"e";
                }
                else
                {
                    str2=str2+"o";
                }
            }
        }
        return str2;
    }
    public static void main(String[] args)
    {
        QueueByLinkedList q1=new QueueByLinkedList();
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(modify(args[i])+" " );
            //q1.enqueue(args[i]);
            System.out.println((int)'1');
        }
    }
}
