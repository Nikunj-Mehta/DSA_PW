package BasicSorting;

public class selectionSort {
    public static void print(int[] arr)
    {
        for(int ele : arr) {
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
    public static void main(String[] args) {
        int[] arr = {100, 5, 19, -8, -15};
        int n = arr.length;
        print(arr);
        // Selection Sort
        for(int i = 0; i < n-1; i++) // agar length 5 hai to 4 baar m sort ho jyega
        {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j = i; j < n; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    mindx = j;
                }
            }
            // Swap arr[i] and arr[mindx]
            swap(arr, i, mindx);
        }
        print(arr);
    }
}
