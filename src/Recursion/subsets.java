package Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class subsets {
    static ArrayList<String> arr = new ArrayList<>(); // global
    public static void printSubset(int i, String s, String ans)
    {
        if(i == s.length())
        {
            arr.add(ans);
            return;
        }
        printSubset(i + 1, s, ans); // Don't take character
        ans += s.charAt(i);
        printSubset(i + 1, s, ans); // take character
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        arr = new ArrayList<>(); // reset
        printSubset(0, s, "");
        System.out.println(arr);
    }
}
