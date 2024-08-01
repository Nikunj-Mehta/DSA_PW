package Recursion;
import java.util.Scanner;
public class oneTon {
    public static void print(int x, int n)
    {
        if(x > n) return;
        System.out.println(x);
        print(x+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        print(1, n);
    }
}
