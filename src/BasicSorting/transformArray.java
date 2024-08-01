package BasicSorting;

public class transformArray {
    public static void print(int[] arr)
    {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {48, 12, 78, 34, 100, 57, 23};
                  // 3, 0, 5, 2, 6, 4, 1
        print(arr);
        int n = arr.length;
        int x = 0;
        for(int i = 0; i < n; i++)
        {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j = 0; j < n; j++)
            {
                if(arr[j] < min && arr[j] > 0)
                {
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }
        // Our required array is ready but filled with negative numbers to make it positive multiply it with -1
        // For each loop can't be used for modifying elements. It can only be used to iterate.
        for(int i = 0; i < n; i++)
        {
            arr[i] *= (-1);
        }
        print(arr);
    }
}
