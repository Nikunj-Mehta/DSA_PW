package Linked_List;

class SinglyLinkedList
{
     Node head;
     Node tail;
     int size;

    public void size()
    {
        System.out.println("Size of Linked List is: "+ size);
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertAtHead(int val)
    {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else
        {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void insertAtTail(int val)
    {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else
        {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void insertAt(int index, int val)
    {
        if(index == 1)
        {
            insertAtHead(val);
            return;
        }

        if(index == size)
        {
            insertAtTail(val);
            return;
        }

        if(index > size || index < 0)
        {
            System.out.println("Invalid Index");
            return;
        }

        if(index > 0 & index < size)
        {
            Node temp = new Node(val);
            Node x = head;
            for(int i = 1; i < index - 1; i++)
            {
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }
    }

    public void get(int index)
    {
        if(index > 0 && index <= size)
        {
            Node x = head;
            for(int i = 1; i < index; i++)
            {
                x = x.next;
            }
            System.out.println(x.val);
        }
        else System.out.println("Invalid Input");
    }

    public void set(int index, int val)
    {
        if(index > size || index < 0)
        {
            System.out.println("Invalid Index");
            return;
        }

        if(index == size)
        {
            tail.val = val;
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++)
        {
            temp = temp.next;
        }
        temp.val = val;
    }

    public void deleteHead()
    {
        if(head == null)
        {
            System.out.println("List if empty");
            return;
        }
        else
        {
            head = head.next;
        }
        size--;
    }

    void delete(int index)
    {
        if(index == 1)
        {
            deleteHead();
            return;
        }

        if(index > 1 && index <= size)
        {
            Node temp = head;
            for(int i = 1; i < index - 1; i++)
            {
                temp = temp.next;
            }
            if(temp.next == tail) tail = temp;
            temp.next = temp.next.next;
            size--;
        }
    }

    public void leftMiddle()
    {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next  != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("The left Middle is: "+ slow.val);
    }

}

public class Practice {
    public static void main(String[] args) {
        SinglyLinkedList n = new SinglyLinkedList();

        n.insertAtHead(10);
        n.insertAtHead(5);
        n.insertAtTail(20);
        n.insertAtTail(27);
        n.display();
        n.size();
        System.out.println(n.head.val);
        System.out.println(n.tail.val);
        n.insertAt(3, 100);
        n.display();
        n.get(4);
        n.set(3, 49);
        n.display();
        System.out.println(n.tail.val);
        n.deleteHead();
        n.delete(4);
        n.display();
        n.size();
        System.out.println(n.tail.val);
        n.insertAtTail(59);
        //n.display();
        n.leftMiddle();
    }
}
