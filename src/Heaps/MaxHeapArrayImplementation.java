package Heaps;

class MaxHeap
{
    private int[] arr;
    private int size;
    MaxHeap(int capacity)
    {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int num)
    {
        arr[size++] = num;
        upheapify(size - 1);
    }
    public void upheapify(int idx)
    {
        if(idx == 0) return; // Base Case.
        int parent = (idx - 1) / 2;
        if(arr[idx] > arr[parent])
        {
            swap(idx, parent);
            upheapify(parent);
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
        return arr[0];
    }

    public int remove() throws Exception
    {
        if(size == 0) throw new Exception("Heap is Empty!");
        int peek = arr[0];
        swap(0, size - 1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int parent)
    {
        if(parent > size) return;
        int leftChild = (2 * parent) + 1, rightChild = (2 * parent) + 2;
        int maxIdx = parent;
        if(leftChild < size && arr[maxIdx] < arr[leftChild]) maxIdx = leftChild;
        if(rightChild < size && arr[maxIdx] < arr[rightChild]) maxIdx = rightChild;
        if(parent == maxIdx) return;
        swap(maxIdx, parent);
        downHeapify(maxIdx);
    }
}
public class MaxHeapArrayImplementation {
    public static void main(String[] args) throws Exception {
        MaxHeap pq = new MaxHeap(10);
        System.out.println(pq.size());
//        System.out.println(pq.peek());
        pq.add(40);
        pq.add(30);
        pq.add(20);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        pq.add(60);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
    }
}
