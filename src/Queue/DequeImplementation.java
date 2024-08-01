package Queue;

import com.sun.security.jgss.GSSUtil;

class dNode
{
    int val;
    dNode prev;
    dNode next;
    dNode(int val)
    {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class DeQue
{
    dNode front = null;
    dNode rear = null;
    int size = 0;

    public boolean isEmpty()
    {
        if(size == 0) return true;
        else return false;
    }

    public int size()
    {
        return size;
    }

    public void insertFront(int val)
    {
        dNode temp = new dNode(val);
        if(size == 0) // DEQue is empty  if(front == null) / if(rear == null)
        {
            front = rear = temp;
        }
        else
        {
            temp.next = front;
            front.prev = temp;
            front = temp;
        }
        size++;
    }

    public void insertRear(int val)
    {
        dNode temp = new dNode(val);
        if(size == 0) // DEQue is empty  if(front == null) / if(rear == null)
        {
            front = rear = temp;
        }
        else
        {
            rear.next = temp;
            temp.prev = rear;
            rear = temp;
        }
        size++;
    }

    public int deleteFront()
    {
        if(size == 0) // DEQue is empty
        {
            System.out.println("DEQue is empty...");
            return -1;
        }
        else
        {
            int x = front.val;
            front = front.next;
            if(front == null) // Only 1 ele that also removed LL is empty now
            {
                rear = null;
            }
            else
            {
                front.prev = null;
            }
            size--;
            return x;
        }
    }

    public int deleteRear()
    {
        if(size == 0) // DEQue is empty
        {
            System.out.println("DEQue is empty...");
            return -1;
        }
        else
        {
            int x = rear.val;
            rear = rear.prev;
            if(rear == null) // Only 1 ele that also removed LL is empty now
            {
                front = null;
            }
            else
            {
                rear.next = null;
            }
            size--;
            return x;
        }
    }

    public int getFront()
    {
        if(size == 0)
        {
            System.out.println("DEQue is empty");
            return -1;
        }
        else return front.val;
    }

    public int getRear()
    {
        if(size == 0)
        {
            System.out.println("DEQue is empty");
            return -1;
        }
        else return rear.val;
    }

    public void display()
    {
        dNode temp = front;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayReverse()
    {
        dNode temp = rear;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
    }
}

public class DequeImplementation {
    public static void main(String[] args) {
        DeQue dq = new DeQue();
        System.out.println(dq.size());
        System.out.println(dq.isEmpty());
        dq.insertFront(10);
        dq.insertRear(20);
        dq.insertRear(30);
        dq.insertRear(40);
        dq.display();
        dq.insertFront(7);
        dq.insertFront(3);
        dq.insertFront(2);
        dq.display();
        System.out.println(dq.size());
        System.out.println(dq.isEmpty());
        System.out.println(dq.deleteFront());
        dq.display();
        System.out.println(dq.deleteRear());
        dq.display();
        System.out.println(dq.getFront());
        System.out.println(dq.getRear());
        dq.displayReverse();
    }
}
