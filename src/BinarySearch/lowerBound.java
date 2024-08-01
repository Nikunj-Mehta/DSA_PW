package BinarySearch;

import java.util.Scanner;

public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 30, 40, 40, 50, 60, 70, 89, 99};
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Give the number for which lower bound if to be found: ");
        int target = sc.nextInt();

        int n = arr.length;
        int lb = n;
        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = (high - low)/2 + low;

            // For upper bound arr[mid] > target; bss itna he change hai
            if(arr[mid] >= target) // aage k elements to mid se bde he rhenge naa
            {
                lb = Math.min(lb,mid);
                high = mid -1;

            }
            else low = mid + 1;
        }
        System.out.println(lb);
    }
}
