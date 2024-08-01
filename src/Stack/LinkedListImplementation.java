package Stack;

class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val = val;
    }
}

class StackUsingLL
{
    Node head = null;
    int size = 0;

    void push(int val)
    {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop()
    {
       if(head == null) // or if(size == 0)
       {
           System.out.println("Stack Underflow");
           return -1;
       }
       else
       {
           int x = head.val;
           head = head.next;
           size--;
           return x;
       }
    }

    int size()
    {
        return size;
    }

    int peek()
    {
        if(head == null) // or if(size == 0)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else return head.val;
    }

    boolean isEmpty()
    {
        if(size == 0) return true; // OR if(head == null)
        else return false;
    }

    void display()
    {
        displayRecursive(head);
    }
    void displayRecursive(Node head)
    {
        if(head == null) return; // Base Case
        displayRecursive(head.next); // function call
        System.out.println(head.val + " "); // work
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        StackUsingLL list = new StackUsingLL();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        System.out.println("The popped ele is: " + list.pop());
        System.out.println("The topmost ele is: " + list.peek());
        System.out.println("Size of list is: " + list.size());
        System.out.println(list.isEmpty());
        list.display();
    }
}
