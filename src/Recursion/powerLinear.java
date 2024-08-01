package Recursion;

import java.util.Scanner;

public class powerLinear {
    public static int power(int a, int b) // TC = O(b)
    {
        if(b == 0) return 1; // base case
        return a * power(a, b - 1); // work along with call
    }

    public static int power2(int a, int b) // TC = O(log b) very fast
    {
        if(b == 0) return 1; // base case
        int ans = power2(a, b/2); // work along with call
        if(b % 2 == 0) return ans * ans;
        else return ans * ans * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int b = sc.nextInt();
        int ans = power2(a, b);
        System.out.println(a+" Raised to the power " +b+ " is: " +ans);
    }
}
