package AdvanceSorting;

public class mergeTwoSortedArray {
    public static void print(int[] arr)
    {
        for(int ele: arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    public static void merge(int[] arr, int[] brr, int[] merged)
    {
        int i = 0, j = 0, k = 0;
        while(i < arr.length && j < brr.length)
        {
            if(arr[i] <= brr[j]) merged[k++] = arr[i++]; // First complete task then increment
            else merged[k++] = brr[j++];
        }

        if(i == arr.length){
            while (j < brr.length) merged[k++] = brr[j++];
        }
        if(j == brr.length)
        {
            while(i < arr.length) merged[k++] = arr[i++];
        }
        // while (j < brr.length) merged[k++] = brr[j++];
        // while(i < arr.length) merged[k++] = arr[i++];
        // We can complete the same in this 2 lines also, as the while loop break on that condition only
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 60, 90};
        int[] brr = {20, 55, 64, 72, 96};
        print(arr);
        print(brr);

        int[] merged = new int[arr.length + brr.length];
        merge(arr, brr, merged);
        print(merged);
    }
}
