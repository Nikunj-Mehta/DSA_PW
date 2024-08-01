package AdvanceSorting;

public class quickSortAlgo {
    public static void print(int[] arr)
    {
        for(int ele: arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi) // Recursion use krne k liyea index chaiyea na isliyea int return type
    {
        int mid = lo + (hi - lo)/2;
        int pivot = arr[mid], pivotIdx = mid;
        int smallerCount = 0;
        for(int i = lo; i <= hi; i++)
        {
            if(i == mid) continue; // khud element ko count nhi krna hai
            if(arr[i] <= pivot) smallerCount++; // to find index where it has to be present
        }
        int correctIdx = lo + smallerCount; // zaroori nhi hai pivot humesha 0 pr mile
        swap(arr, pivotIdx, correctIdx); // pivot ko uski sahi jagah rakh diya
        // Partition: left part me elements <= pivot, right part m >= pivot
        int i = lo, j = hi;
        while(i < correctIdx && j > correctIdx)
        {
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else if(arr[i] > pivot && arr[j] <= pivot) swap(arr, i, j);
        }
        return correctIdx;
    }
    public static void quickSort(int[] arr, int lo, int hi)
    {
        if(lo > hi) return; // Base Case for recursion (if array size 0 or 1 so return)
        // pivot (arr[lo]) and put it in correct place
        // Find no of elements smaller than pivot i.e. smallerCount, index = lo + smallerCount
        int idx = partition(arr, lo, hi);
        quickSort(arr, lo, idx - 1);
        quickSort(arr, idx + 1, hi);
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 2, 3, 6, 5, 8};
        print(arr);
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        print(arr);
    }
}
