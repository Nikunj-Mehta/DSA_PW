package BasicSorting;

public class reverseBubbleSort {
    public static void print(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10, 15, 74, -4, -84, 100};
        int n = arr.length;
        print(arr);
        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-1-i; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
}
