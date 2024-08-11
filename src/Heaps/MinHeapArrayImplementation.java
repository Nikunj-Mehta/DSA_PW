package Heaps;

class MinHeap{
    private int[] arr;
    private int size;
    MinHeap(int capacity) // Constructor
    {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int num) throws Exception
    {
        if(size == arr.length) throw new Exception("Array is full");
        arr[size++] = num; // Step 1 : Add ele at last.
        upheapify(size - 1); // Step 2. size - 1 for current ele.
    }
    public void upheapify(int idx)
    {
        if(idx == 0) return; // Base Case.
        int parent = (idx - 1) / 2;
        if(arr[idx] < arr[parent])
        {
            swap(idx, parent);
            upheapify(parent); // Jaha pr bhi hu apne parent se compare kru
        }
    }
    public void swap(int idx, int parent)
    {
        int temp = arr[idx];
        arr[idx] = arr[parent];
        arr[parent] = temp;
    }

    public int size()
    {
        return size;
    }

    public int peek() throws Exception
    {
        if(size == 0) throw new Exception("Heap is Empty!");
        return arr[0]; // This ele will always be on top as it is minimum.
    }

    public int remove() throws Exception
    {
        if(size == 0) throw new Exception("Heap is Empty");
        int peek = arr[0];
        swap(size - 1, 0); // Send the topmost or smallest ele at last to delete it.
        size--; // Now the topmost(smallest) ele which is at last will be overwritten.
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int parent)
    {
        if(parent > size) return;
        int leftChild = (2 * parent) + 1, rightChild = (2 * parent) + 2;
        int minIdx = parent;
        if(leftChild < size && arr[leftChild] < arr[minIdx]) minIdx = leftChild;
        if(rightChild < size && arr[rightChild] < arr[minIdx]) minIdx = rightChild;
        if(parent == minIdx) return;
        swap(parent, minIdx);
        downHeapify(minIdx);
    }
}
public class MinHeapArrayImplementation {
    public static void main(String[] args) throws Exception {
        MinHeap pq = new MinHeap(10);
        System.out.println(pq.size());
//        System.out.println(pq.peek());
//        pq.remove();
        pq.add(1);
        pq.add(6);
        pq.add(2);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        pq.add(0);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        pq.add(-4);
        System.out.println(pq.peek() + " " + pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
    }
}
