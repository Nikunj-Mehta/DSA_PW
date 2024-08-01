package BasicSorting;

 public class insertionSort {
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
        // Insertion Sort Method - 1
//        for(int i = 1; i < n; i++) // agar length 5 hai to 4 baar m sort ho jyega
//        {
//            for (int j = i; j >= 1 && (arr[j] < arr[j - 1]); j--){
//                    swap(arr, j, j - 1);
//            }
//        }

        // Standard method for Insertion Sort
        for(int i = 1; i < n; i++) // n-1 passes
            {
                int j = i;
                while (j >= 1 && arr[j] < arr[j - 1])
                {
                    swap(arr, j, j-1);
                    j--;
                }
            }
        print(arr);
    }
}
