package Recursion;

import java.util.Scanner;

public class NthStair {
    public static int stair(int n)
    {
        if(n <= 2) return n; // base case
        return stair(n - 1) + stair(n - 2); // work along with call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int ans = stair(n);
        System.out.println(ans);
    }
}
