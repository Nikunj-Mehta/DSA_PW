package Stack;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        System.out.println("Prefix expression is: " + str);
        Stack<String> val = new Stack<>();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii >= 48 && ascii <= 57)
            {
                val.push(ch + ""); // If it's number then convert it into string and push in stack
            }
            else
            {
                String v1 = val.pop();
                String v2 = val.pop();
                String t = v1 + v2 + ch;
                val.push(t);
            }
        }
        System.out.println("Postfix Conversion is: "+ val.peek());
    }
}
