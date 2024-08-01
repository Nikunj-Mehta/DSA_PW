package Strings;

import java.sql.SQLOutput;

public class basicFunctions {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s.substring(1)); // bcde print 3 and next indices
        System.out.println(s.substring(1,4)); // bcd 1 se 4 -1 index tk sbb print hoga
        System.out.println(s.substring(2,2)); // it will print nothing as j is not included
        System.out.println(s.substring(2,3)); // char present at index 2
        System.out.println(s.substring(0,5)); // abcde
        System.out.println();

        // Print all substrings
        for(int i = 0; i <= s.length(); i++)
        {
            for(int j = i+1; j <= s.length(); j++)
            {
                System.out.print(s.substring(i,j)+ " ");
            }
            System.out.println();
        }
    }
}
