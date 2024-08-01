package Strings;

public class maxValueInStrings{
    public static void main(String[] args) {
        String[] arr = {"0000000563", "746745", "56354", "0025"};
        String maxS = arr[0];
        // Traverse array and return max value of string
        for(int i = 1; i < arr.length; i++)
        {
            maxS = max(maxS, arr[i]); // max is a function which will return max String
        }
        System.out.println(maxS);
    }
    // Max function defination
    public static String max(String a, String b)
    {
        String s = purify(a), t = purify(b); // purify is a function which will remove leading zeroes and will return Substring
        if(s.length() > t.length()) return a;
        if(s.length() < t.length()) return b;
        // if(s.length() == t.length())
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != t.charAt(i)) // Ascii value of 9 > ascii value of 8 (direct Character comparision)
            {
                if(s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        // if two srings 00078 and 078 so return 00078
        if(a.length() >= b.length()) return a;
        else return b;
    }
    // to remove all leading 0's purify function
    public static String purify(String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != '0') return s.substring(i); // return substring from i till end
        }
        return s;
    }
}
