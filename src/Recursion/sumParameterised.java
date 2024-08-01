package Recursion;
import java.util.Scanner;

public class sumParameterised {
    public static int add(int n, int sum)
    {
        if(n == 0){// base case
            return sum;
        }
        sum += n; // work
        return add(n-1, sum); //(call) to pass the result of recursive call back up the call stack we use return
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = add(n, 0);
        System.out.println(ans);
    }
}