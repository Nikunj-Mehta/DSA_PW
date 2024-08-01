package Linked_List;

class SLL
{ // User defined date Structure
    private Node head;
    public Node tail;
    private int size;

    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size()
    {
        System.out.println("length of Linked List is: "+size);
    }

    void insertAtBeginning(int val)
    {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtEnd(int val)
    {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp; // tail ka next jo aabhi null tha usme temp daala
            tail = temp; // aabhi last wale ko tail bola
        }
        size++;
    }

    void insertAt(int index, int val)
    {
        if(index == 0)
        {
            insertAtBeginning(val);
            return;
        }
        if(index == size)
        {
            insertAtEnd(val);
            return;
        }
        if(index > size || index < 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        if(index > 0 && index <= size)
        {
            Node temp = new Node(val);
            Node x = head;
            for(int i = 0; i < index - 1; i++)
            {
                x = x.next;
            }
            // insertion
            temp.next = x.next;
            x.next = temp;
            size++;
        }
    }

    int getElement(int index) throws Error
    {
        if(index == size - 1) return tail.val;
        if(index >= size || index < 0)
        {
            throw new Error("Invalid Input");
        }
        Node temp = head;
        for(int i = 0; i < index; i++)
        {
            temp = temp.next;
        }
        return temp.val;
    }

    void set(int index, int val) throws Error
    {
        if(index == size - 1)
        {
            tail.val = val;
            return;
        }
        if(index < 0 || index >= size)
        {
            throw new Error("Invalid Input");
        }
        Node temp = head;
        for(int i = 0; i < index; i++)
        {
            temp = temp.next;
        }
        temp.val = val;
    }

    void deleteHead() throws Error
    {
        if(head == null) throw new Error("List is Empty");
        head = head.next;
        size--;
    }

    void delete(int index) throws Error
    {
        if(index == 0)
        {
            deleteHead();
            return;
        }
        if(index < 0 || index >= size) throw new Error("Invalid Input");
        Node temp = head;
        for(int i = 0; i < index - 1; i++)
        {
            temp = temp.next;
        }
        if(temp.next == tail) tail = temp;
        temp.next = temp.next.next;
        size--;
    }
}
public class implementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();
        list.size();

        list.insertAtBeginning(50);
        list.display();
        list.size();
        // System.out.println(list.head.val); // Head is 50
        list.insertAt(4, 80);
        list.display();
        System.out.println(list.getElement(3));
        // System.out.println(list.getElement(9)); // Error
        list.display();
        list.set(3, 90);
        list.display();
        list.deleteHead();
        list.display();
        list.size();

        list.delete(2);
        list.display();
        list.size();

        list.delete(3);
        list.display();
        System.out.println(list.tail.val);
    }
}
