package BasicSorting;

public class optimizedBubbleSort {
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
        // Bubble sort Optimized
        for(int x = 0; x < n-1; x++) // n-1 passes
        {
            boolean flag = true;
            for(int i = 0; i < n-1-x; i++)
            {
                if(arr[i] > arr[i+1]) // Swap
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            // Check if this pass is sorted or not if sorted break
            // Since sorted to aur kyu chalana hai so break
            if(flag = true) break;
        }
        print(arr);
    }
}
