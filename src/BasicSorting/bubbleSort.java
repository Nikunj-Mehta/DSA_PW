package BasicSorting;

public class bubbleSort {
    public static void print(int[] arr)
    {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
            System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 10};
        int n = arr.length;
        print(arr);
        // Bubble sort - 2
        for(int x = 0; x < n-1; x++) // n-1 passes
        {
            for(int i = 0; i < n-1-x; i++) // Bubble sort 1 was for(int i = 0; i < n-1; i++)
            {
                if(arr[i] > arr[i+1]) // Swap
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        print(arr);
    }
}
