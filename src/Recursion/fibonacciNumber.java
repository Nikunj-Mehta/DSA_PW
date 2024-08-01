package Recursion;
import java.util.Scanner;

public class fibonacciNumber {
    public static int fibo(int n)
    {
        if(n <= 1) return n; // base case
        return fibo(n - 1) + fibo(n - 2); // work along with call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int ans = fibo(n);
        System.out.println("The "+n+"th term of fibonacci series is: " +ans);
    }
}
