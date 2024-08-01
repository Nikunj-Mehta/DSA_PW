package Recursion;

import java.util.Scanner;

public class binaryStrings {
    public static void printStrings(int n, String ans)
    {
        int m = ans.length();
        if(m == n){
            System.out.println(ans);
            return;
        }
        if(m == 0 || ans.charAt(m - 1) == '0') // agar string empty hai ya last m 0 hai to 1 aur 0 dono aa sakte hai isliyea dono add kr k call lagaya
        {
            printStrings(n, ans + 0);
            printStrings(n, ans + 1);
        }
        else  // s.charAt(m - 1) == 1 to yaha pr 1 nhi aa sakta isliyea bs 0 add kr k call lagaya
        {
            printStrings(n, ans + 0);
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printStrings(n, "");
    }
}
