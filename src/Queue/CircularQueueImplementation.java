package Queue;

class CircularQueue
{
    int front = -1;
    int rear = -1;
    int size = 0;
    int[] arr = new int[5];
    int n = arr.length;

    public boolean isEmpty()
    {
//        if(size == 0) return true;
//        else return false;
        return size == 0;
    }

    public boolean isFull()
    {
        return size == n;
    }

    public int size()
    {
        return size;
    }

    public void add(int val)
    {
        if(size == 0)
        {
            front = rear = 0;
            arr[rear] = val;
        }
        else if(size == n)
        {
            System.out.println("Circular Queue is full");
            return;
        }
        else if(rear < n - 1)
        {
            arr[++rear] = val;
        }
        else if(rear == n - 1) // no need to add condition as we have checked that size is not full
        {
            rear = 0;
            arr[rear] = val;
        }
        size++;
    }

    public int remove()
    {
        if(size == 0) // Circular Queue is empty
        {
            System.out.println("Circular Queue is empty...");
            return -1;
        }
        else
        {
            int val = arr[front];
            if(front == n - 1) front = 0;
            else front++;
            size--;
            return val;
        }
    }

    public int peek()
    {
        if(size == 0)
        {
            System.out.println("Circular Queue is empty...");
            return -1;
        }
        else return arr[front];
    }

    public void display()
    {
        if(size == 0)
        {
            System.out.println("Circular Queue is empty");
            return;
        }
        else if(front <= rear)
        {
            for(int i = front; i <= rear; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
        else // rear is less than front
        {
            for(int i = front; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i <= rear; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

}

public class CircularQueueImplementation {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        System.out.println(cq.isEmpty());
        System.out.println(cq.size());
        System.out.println(cq.isFull());
        cq.display();
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        System.out.println(cq.isFull());
        cq.display();

        cq.add(60);
        System.out.println(cq.remove());
        cq.display();
        cq.add(60);
        cq.display(); // Circular queue will be 60 20 30 40 50 but display will be 20 30 40 50 60
        System.out.println(cq.peek());
        System.out.println(cq.isEmpty());
        System.out.println(cq.size());
    }
}
