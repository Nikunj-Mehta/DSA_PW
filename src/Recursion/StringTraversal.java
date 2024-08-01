package Recursion;

public class StringTraversal {
    public static void print(int i, String s)
    {
        if(i == s.length()) return; // base case
        System.out.print(s.charAt(i)); // work
        print(i + 1, s); // function call
    }
    public static void main(String[] args) {
        String s = "Nikunj Mehta";
        print(0, s);
    }
}
