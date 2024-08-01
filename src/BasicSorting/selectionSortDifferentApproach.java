package BasicSorting;

public class selectionSortDifferentApproach {
    public static void print(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele+" ");
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
        int[] arr = {16, 36, 2, -1, 46, 4, 26};
        int n = arr.length;
        print(arr);

        for(int i = 0; i < n-1; i++)
        {
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for(int j = 0; j < n-i; j++)
            {
                if(arr[j] > max)
                {
                    max = arr[j];
                    maxdx = j;
                }
            }
            swap(arr, (n-1-i), maxdx);
        }
        print(arr);
    }
}
