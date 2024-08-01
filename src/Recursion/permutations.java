package Recursion;
import java.util.Scanner;

public class permutations {
    public static void printPermutations(String ans, String s)
    {
        if(s.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            printPermutations(ans + ch, left + right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        printPermutations("", s);
    }
}
/*
Explanation
Initial Call:

printPermutations("", "abc")
ans is ""
s is "abc"


First Level of Recursion:

Loop over s = "abc":
i = 0: ch = 'a', left = "", right = "bc"
Call printPermutations("a", "bc")
i = 1: ch = 'b', left = "a", right = "c"
Call printPermutations("b", "ac")
i = 2: ch = 'c', left = "ab", right = ""
Call printPermutations("c", "ab")
Second Level of Recursion:

For printPermutations("a", "bc"):
Loop over s = "bc":
i = 0: ch = 'b', left = "", right = "c"
Call printPermutations("ab", "c")
i = 1: ch = 'c', left = "b", right = ""
Call printPermutations("ac", "b")
For printPermutations("b", "ac"):
Loop over s = "ac":
i = 0: ch = 'a', left = "", right = "c"
Call printPermutations("ba", "c")
i = 1: ch = 'c', left = "a", right = ""
Call printPermutations("bc", "a")
For printPermutations("c", "ab"):
Loop over s = "ab":
i = 0: ch = 'a', left = "", right = "b"
Call printPermutations("ca", "b")
i = 1: ch = 'b', left = "a", right = ""
Call printPermutations("cb", "a")
Third Level of Recursion:

For printPermutations("ab", "c"):
s is "c", loop over s:
i = 0: ch = 'c', left = "", right = ""
Call printPermutations("abc", "")
s is "", print "abc"
For printPermutations("ac", "b"):
s is "b", loop over s:
i = 0: ch = 'b', left = "", right = ""
Call printPermutations("acb", "")
s is "", print "acb"
For printPermutations("ba", "c"):
s is "c", loop over s:
i = 0: ch = 'c', left = "", right = ""
Call printPermutations("bac", "")
s is "", print "bac"
For printPermutations("bc", "a"):
s is "a", loop over s:
i = 0: ch = 'a', left = "", right = ""
Call printPermutations("bca", "")
s is "", print "bca"
*/