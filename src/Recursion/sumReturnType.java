package Recursion;

import java.util.Scanner;

public class sumReturnType {
    public static int add(int n)
    {
        if(n == 0 || n == 1) return n; // Base case
        return n + add(n - 1); // function call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(add(n));
    }
}
