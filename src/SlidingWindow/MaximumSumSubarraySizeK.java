package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 10};
        int k = 2;
//        // Brute Force.
//        int n = arr.length;
//        int maxSum = 0;
//        for(int i = 0; i < n - k + 1; i++)
//        {
//            int sum = 0;
//            for(int j = i; j < i + k; j++)
//            {
//                sum += arr[j];
//            }
//            maxSum = Math.max(maxSum, sum);
//        }
//        System.out.println(maxSum);

        // Optimised approach Using Sliding Window
        // TC = O(n).
        int n = arr.length;
        int maxSum = 0;
        int i = 0, j = k - 1, sum = 0;
        for(int a = 0; a <= k - 1; a++) // TC = O(k)
        {
            sum += arr[a]; // k times , to find sum of elements form 0 to k...
        }
        maxSum = sum;
        i++; j++;
        while(j < n) // n - k times
        {
            sum = sum - arr[i - 1] + arr[j];
            maxSum = Math.max(maxSum, sum);
            i++;  j++;
        }
        System.out.println(maxSum);
    }
}
