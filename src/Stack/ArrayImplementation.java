package Stack;

class StackUsingArray
{
    private int[] arr = new int[5];
    private int idx = 0;

    void push(int val)
    {
        if(isFull()) System.out.println("Stack Overflow");
        else {
            arr[idx] = val;
            idx++;
        }
    }
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        int top = arr[idx - 1];
        arr[idx - 1] = 0;
        idx--;
        return top;
    }
    boolean isEmpty()
    {
        if(idx == 0) return true;
        else return false;
    }
    boolean isFull()
    {
        if(idx == arr.length) return true;
        else return false;
    }
    int size()
    {
        return idx;
    }
    void display()
    {
        for(int i = 0; i < idx; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    void peek()
    {
        if(idx == 0) System.out.println("Stack Underflow");
        else {
            System.out.println(arr[idx - 1]);
        }
    }
}

public class ArrayImplementation {
    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(4);
        st.push(24);
        st.push(38);
        st.push(54);
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.peek();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.display();
        System.out.println(st.size());
        st.push(68);
        st.push(72);
        st.push(88);
        System.out.println(st.isFull());
        st.display();
        st.push(2); // Stack overflow
    }
}
