package Queue;

class Que
{
    int f = -1;
    int r = -1;
    int size = 0;
    int[] arr = new int[5];

    public void add(int val)
    {
        if(r == arr.length - 1) // if(size == arr.length)
        {
            System.out.println("Queue is full"); // Queue overflow
            return;
        }
        if(size == 0)
        {
            f = r = 0;
            arr[r] = val;
        }
        else
        {
            arr[++r] = val;
        }
        size++;
    }

    public int remove()
    {
        if(size == 0) // if(r == -1)
        {
            System.out.println("Queue is empty"); // Queue underflow
            return -1;
        }
        else
        {
            int temp = arr[f++];
            size--;
            return temp;
        }
    }

    public int size()
    {
        return size;
    }

    public int peek()
    {
        if(r == -1) // if(f == -1)
        {
            System.out.println("Queue is empty"); // chech for underflow
            return -1;
        }
        else
        {
            return arr[f];
        }
    }

    public boolean isEmpty()
    {
        if(size == 0) return true;
        else return false;
    }

    public void display()
    {
        if(size == 0) System.out.println("Queue is empty");
        else
        {
            System.out.print("[");
            for(int i = f; i <= r; i++)
            {
                System.out.print(arr[i] + ", ");
            }
            System.out.print("]");
        }
        System.out.println();
    }

}

public class ArrayImplementation {
    public static void main(String[] args) {
       Que que = new Que();
       System.out.println(que.isEmpty());
       que.add(10);
       que.add(20);
       que.add(30);
       que.add(40);
       que.display();
       System.out.println(que.remove());
       System.out.println(que.peek());
       System.out.println(que.size());
       System.out.println(que.isEmpty());
       que.display();
    }
}
