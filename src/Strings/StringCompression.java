package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaaaaaaagggggggeeeeccuuudddefhhhh";
        char[] arr = s.toCharArray();
        String ans = "";
        int i = 0, j = 0;
        while(j < arr.length)
        {
            if (arr[j] == arr[i]) j++;
            else {
                ans += arr[i]; // in array ans a
                int len = j - i;
                if(len > 1) ans += len; // if len > 1 then in array ans a5(for no.of a's)
                i = j; // to bring i to different character
            }
        }
        // to print last character as the loop will break when it reaches end
        ans += arr[i];
        int len = j - i;
        if(len > 1) ans += len;
        System.out.println(ans);
    }
}
