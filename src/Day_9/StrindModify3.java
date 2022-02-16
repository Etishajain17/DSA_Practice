package Day_9;

class Node2
{
    String data;
    Node2 next;
    Node2(String data)
    {
        this.data=data;
    }
}
class QueueByLinkedList2
{
    Node2 front;
    Node2 rear;
    public void enqueue(String data)
    {
        Node2 n1=new Node2(data);
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
public class StrindModify3
{
    public static String modify3(String str)
    {
        int sum=0;
        String str2="";

        for (int i = str.length()-1; i >=0; i--)
        {
            sum=sum+(Character.getNumericValue(str.charAt(i)))*(i+1);
        }
//        for (int i = str.length()-1; i >=0; i--)
//        {
//            sum=sum+(((int)str.charAt(i)-48)*(i+1));
//        }
        str2=Integer.toString(sum);
       return str2;
    }
    public static void main(String[] args) {
        QueueByLinkedList2 q2=new QueueByLinkedList2();
        if(args.length>2)
        {
            System.out.println("Wrong input");
        }
        else
        {
            args[0]=modify3(args[0]);
            args[1]=modify3(args[1]);
            q2.enqueue(args[0]);
            q2.enqueue(args[1]);
            System.out.println(args[0]+" "+args[1]);
        }
    }
}
