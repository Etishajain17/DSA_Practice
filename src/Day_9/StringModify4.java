package Day_9;
//123456 78789 609
class Node3
{
    Boolean value;
    Node3 next;

    public Node3(boolean value)
    {
        this.value=value;
    }
}
class PriorityQueueByLinkedList
{
    Node3 front;
    public void enqueue(Node3 newNode)
    {
        if(front==null || newNode.value==false)
        {
            newNode.next=front;
            front=newNode;
        }
        else
        {
            Node3 temp=front;
            while(temp.next.value==false && temp.next!=null)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
}
public class StringModify4
{
    public static boolean isStep(String str)
    {
        for (int j = 0; j < str.length()-1; j++)
        {
            if((Character.getNumericValue(str.charAt(j))-Character.getNumericValue(str.charAt(j+1)))!=1 &&
                    (Character.getNumericValue(str.charAt(j))-Character.getNumericValue(str.charAt(j+1)))!=-1 )
            {
                return false;
            }

        }

        return true;

    }
    public static void main(String[] args) {
        PriorityQueueByLinkedList pq=new PriorityQueueByLinkedList();
        for (int i = 0; i < args.length; i++) {
            pq.enqueue(new Node3(isStep(args[i])));
            System.out.println(isStep(args[i]));
        }
    }
}
