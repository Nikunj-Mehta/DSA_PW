package Queue;

class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val = val;
        this.next = null;
    }
}

class QueueLL
{
    Node head = null;
    Node tail = null;
    int size = 0;

    public void add(int val)
    {
        Node temp = new Node(val);
        if(size == 0) head = tail = temp;
        else
        {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int peek()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else return head.val;
    }

    public int remove()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else
        {
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }
    }

    public boolean isEmpty()
    {
        if(size == 0) return true;
        else return false;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size()
    {
        return size;
    }
}
public class LinkedListImplementation {
    public static void main(String[] args) {
        QueueLL que = new QueueLL();
        System.out.println(que.size());
        System.out.println(que.isEmpty());
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.display();
        System.out.println(que.remove());
        que.display();
        System.out.println(que.size());
        System.out.println(que.isEmpty());
        System.out.println(que.peek());
    }
}
