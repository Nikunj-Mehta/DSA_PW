package AdvanceSorting;

import java.util.Scanner;

public class KthSmallestElement {
    static int ans;
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
    public static void quickSelect(int[] arr, int lo, int hi, int k)
    {
        if(lo > hi) return;
//        if(lo == hi) // Not really required
//        {
//            if(lo == k - 1) ans = arr[lo];
//            return;
//        }
        int idx = partition(arr, lo, hi);
        if(idx == k - 1) // Kth smallest element will be present at (k - 1)th index
        {
            ans = arr[idx];
            return;
        }
        if(k - 1 < idx) quickSelect(arr, lo, idx - 1, k); // Dono ko call nhi lagana hai check kro jo index chaiyea vo left part m lie krega
        else quickSelect(arr, idx + 1, hi, k); // agar desired index(k - 1) is less than index then go left else go right
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 2, 6, 5, 8};
        int n = arr.length;
        print(arr);
        System.out.print("Enter the value of k:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ans = -1;
        quickSelect(arr, 0, n - 1, k);
        // For nth largest element replace k by (n - k + 1)
        //quickSelect(arr, 0, n - 1, n - k  + 1);
        System.out.println(ans);
    }
}
