package AdvanceSorting;

public class inversionCount {
    static int count = 0; // static keyword in java is used to make all methods or classes use single variable
    // also JVM always initializes static keywords
    public static void print(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
//    public static void inversion(int[] a, int[] b)
//    {
//        int i = 0, j = 0;
//        while(i < a.length && j < b.length)
//        {
//            if(a[i] > b[j])
//            {
//                count += a.length - i; // uss element se end tk k saare isliyea a - i
//                j++;
//            }
//            else i++;
//        }
//    }
    public static void merge(int[] arr, int[] a, int[] b)
    {
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length)
        {
            // To make merge sort stable always put <= in below line
            if(a[i] <= b[j])
            {
                arr[k++] = a[i++]; // First complete task then increment
            }
            else // a[i] > b[j]
            {
                count += a.length - i; // bss ye 1 line extra add kr do
                arr[k++] = b[j++]; // Instead of creating a function inversion add an extra line here because condition is same
                // increment to ho he rha hai to krne ka kaam he nhi hai
            }
        }

        while (j < b.length) arr[k++] = b[j++];
        while(i < a.length) arr[k++] = a[i++];
        // We can complete the same in this 2 lines also, as the while loop break on that condition only
    }
    public static void mergesort(int[] arr)
    {
        int n = arr.length;
        if(n == 1) return; // Base Case
        // Creating empty array
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];
        // Copy-Paste
        for(int i = 0; i < n/2; i++) a[i] = arr[i];
        for(int i = 0; i < n - n/2; i++) b[i] = arr[n/2 + i];
        // Magic(Recursion)
        mergesort(a);
        mergesort(b);
        // Inversion Count
        //inversion( a, b); // Same code as merge sort only this is extra
        // After inversion merge them into single array
        merge(arr, a, b);
        // Delete a and b after completion
        a = null;
        b = null;
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 5, 3, 1, 4};
        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println(count);
    }
}
