package Recursion;

import java.util.Scanner;

public class mazePath {
    public static int maze(int row, int col, int m, int n) // where m and n are ending or destination row and column
    {
        if(row == m || col == n) return 1; // if we are at ending row or column we are left with only 1 path
        // one more base case
//            if(row == m && col == n) return 1;
//            if(row > m || col > n) return 0;
        int rightWays = maze(row, col + 1, m, n);
        int downWays = maze(row + 1, col, m, n);
        return rightWays + downWays; // total no of ways
    }

    public static int maze2(int m, int n) // where m and n are ending or destination row and column
    {// In this function instead of 4 variables we use only 2
        if(m == 1 || n == 1) return 1;
        int rightWays = maze2(m, n - 1);
        int downWays = maze2(m - 1, n);
        return rightWays + downWays; // total no of ways
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int n = sc.nextInt();
        int ans = maze2(m, n); // if we take from 0 (0, 0, m - 1, n - 1)
        System.out.println("Number of ways are: "+ ans);
    }
}
