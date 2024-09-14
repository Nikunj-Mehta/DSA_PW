package DynamicProgramming;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class FriendsPairingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        //System.out.println(pair(n, dp));
        System.out.println(friend(n));
    }

    private static int friend(int n)
    {
        int[] dp = new int[n + 1];
        if(n > 0) dp[1] = 1;
        if(n > 1) dp[2] = 2;
        for(int i = 3; i < n + 1; i++)
        {
            dp[i] = dp[i - 1] + (i - 1)*dp[i - 2];
        }
        return dp[n];
    }

    // Recursion + Memoization
    private static int pair(int n, int[] dp)
    {
        if(n <= 2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = pair(n - 1, dp) + (n - 1)*pair(n - 2, dp);
    }
}
