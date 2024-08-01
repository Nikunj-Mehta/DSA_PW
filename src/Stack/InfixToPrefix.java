package Stack;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String str = "8-(5+3)*(4/6)";
        System.out.println("Expression is: " + str);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if(ascii >= 48 && ascii <= 57) // ascii value range for 0-9
            {
                String s = "" + ch; // To make it string
                val.push(s);
            }
            else if(op.isEmpty() || ch == '(' || op.peek() == '(')
            {
                op.push(ch);
            }
            else if(ch == ')')
            {
                while(op.peek() != '(')
                {
                    // Do the operation
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop(); // remove the opeaning bracket
            }
            else
            {
                if(ch == '+' || ch == '-')
                {
                    // do operation always
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    op.push(ch);
                }
                else if(ch == '*' || ch == '/')
                {
                    if(op.peek() == '*' || op.peek() == '/')
                    {
                        // do operation always
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size() > 1)
        {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);

        }
        System.out.println("Answer is: " + val.peek());
    }
}
