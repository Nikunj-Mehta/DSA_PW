package AdvanceSorting;

public class mergeSort {
    public static void print(int[] arr)
    {
        for(int ele: arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    public static void merge(int[] arr, int[] brr, int[] merged) // merge two array into single array ka code hai
    {
        int i = 0, j = 0, k = 0;
        while(i < arr.length && j < brr.length)
        {
            // To make merge sort stable always put <= in below line
            if(arr[i] <= brr[j]) merged[k++] = arr[i++]; // First complete task then increment
            else merged[k++] = brr[j++];
        }

         while (j < brr.length) merged[k++] = brr[j++];
         while(i < arr.length) merged[k++] = arr[i++];
        // We can complete the same in this 2 lines also, as the while loop break on that condition only
    }
    public static void mergesort(int[] arr)
    {
        int n = arr.length;
        if(n == 1) return; // Base-Case single element array is always sorted
        // Create two arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n - n/2]; // If odd elements
        // Copy-Paste
        for(int i = 0; i < n/2; i++) a[i] = arr[i];

        for(int i = 0; i < n - n/2; i++) b[i] = arr[i + n/2]; // you can validate this for odd and even

        //magic(Recursion)
        mergesort(a);
        mergesort(b);
        // merge Two sorted arrays 'a' and 'b' into single array "arr"
        merge(a, b, arr);
        // To reduce space complexity delete 'a' and 'b' after merging
        a = null;
        b = null;
    }
    public static void main(String[] args) {
        int[] arr = {87, 94, 83, 20, 58, 52, 48};
        print(arr);
        mergesort(arr);
        print(arr);
    }
}
