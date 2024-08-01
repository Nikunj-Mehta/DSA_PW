package Linked_List;

class dNode
{
    int val;
    dNode next;
    dNode prev;
    dNode(int val)
    {
        this.val = val;
    }
}

class DLL
{
    dNode head;
    dNode tail;
    int size;
    void display()
    {
        dNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtTail(int val)
    {
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else
        {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val)
    {
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtIndex(int idx, int val)
    {
        if(idx == 0)
        {
            insertAtHead(val);
            return;
        }
        if(idx == size - 1)
        {
            insertAtTail(val);
            return;
        }
        if(idx < 0 || idx > size)
        {
            System.out.println("Invalid Index");
            return;
        }
            dNode temp = new dNode(val);
            dNode x = head;
            for(int i = 0; i < idx - 1; i++)
            {
                x = x.next;
            }
            dNode y = x.next;
            x.next = temp; temp.prev = x;
            y.prev = temp; temp.next = y;

            size++;
    }

    void deleteHead()
    {
        if(head == null) System.out.println("List is empty...");
        else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void deleteTail() throws Error
    {
        if(tail == null) throw new Error("List is empty");
        else
        {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    void delete(int idx) throws Error
    {
        if(idx == 0)
        {
            deleteHead();
            return;
        }
        if(idx == size - 1)
        {
            deleteTail();
            return;
        }
        if(idx > size || idx < 0) throw new Error("Invalid Input");
        else {
             dNode x = head;
             for(int i = 0; i < idx - 1; i++) {
                 x = x.next;
             }
             x.next = x.next.next;
             x = x.next;
             x.prev = x.prev.prev;
             size--;
        }
    }

    void get(int idx)
    {
        if(idx == 0)
        {
            System.out.println(head.val);
        }
        if(idx == size - 1)
        {
            System.out.println(tail.val);
        }
        if(idx > size || idx < 0)
        {
            System.out.println("Invalid Index");
        }

        dNode temp = head;
        for(int i = 0; i <= idx - 1; i++)
        {
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    void set(int idx, int val)
    {
        if(idx == 0)
        {
            head.val = val;
        }
        if(idx == size - 1)
        {
            tail.val = val;
        }
        if(idx > size || idx < 0)
        {
            System.out.println("Invalid Index...");
        }
        else
        {
            dNode temp = head;
            for(int i = 0; i <= idx - 1; i++)
            {
                temp = temp.next;
            }
            temp.val = val;
        }
    }
}

public class DoublyLinkedListImplementation{
    public static void print(dNode head)
    {
        dNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail)
    {
        dNode temp = tail;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node)
    {
        dNode temp = node;
        while(temp.prev != null)
        {
            temp = temp.prev;
        }
        // now temp is at head
        print(temp);
    }
    public static void main(String[] args) {
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);
        list.insertAtHead(50);
        list.display();
        list.insertAtIndex(3, 80);
        list.display();
        list.deleteHead();
        list.display();
        list.deleteTail();
        list.display();
        list.delete(2);
        list.display();
        list.insertAtIndex(2, 40);
        list.insertAtTail(50);
        list.display();
        list.get(3);
        list.set(2, 80);
        list.display();
    }
}
