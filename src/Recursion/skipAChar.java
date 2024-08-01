package Recursion;

public class skipAChar {
    public static void skip(int i, String s, String ans)
    {
        if(i == s.length()) // base case
        {
            System.out.println(ans); // work
            return;
        }
        if(s.charAt(i) != 'a') skip(i+1, s, ans+s.charAt(i)); // if not equal to a then add and then call
        else skip(i + 1, s, ans); // function call     // if equal to a then don't add and call
    }
    public static void main(String[] args) {
        String s = "Nikunj Mehta";
        skip(0, s, ""); // "" this is an empty string
    }
}
