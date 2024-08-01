package Recursion;

import java.util.Scanner;

public class nToOne {
    public static void print(int n)
    {
        if(n == 0) return; //base case
        System.out.println(n); // work
        print(n-1); // call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        print(n);
    }
}
