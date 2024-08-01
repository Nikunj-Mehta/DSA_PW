package Stack;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6"; // Try avoiding spaces
        int n = str.length();
        System.out.println("Expression is: " + str);

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < n; i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57) // This is the range for numbers 0 - 9 in ascii
            {
                val.push(ascii - 48); // -48 because 0's ascii value is 48
            }
            else if(op.isEmpty() || ch == '(' || op.peek() == '(') op.push(ch);
            else if(ch == ')')
            {
                while(op.peek() != '(')
                {
                    // Do the operation
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1 - v2);
                    if(op.peek() == '+') val.push(v1 + v2);
                    if(op.peek() == '*') val.push(v1 * v2);
                    if(op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                }
                op.pop(); // Pop the open bracket
            }
            else {
                if(ch == '+' || ch == '-')
                {
                    // We will always have to do operation as it's priority is less
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1 - v2);
                    if(op.peek() == '+') val.push(v1 + v2);
                    if(op.peek() == '*') val.push(v1 * v2);
                    if(op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                    op.push(ch); // We pushed current character in operator op stack
                }
                else if(ch == '*' || ch == '/')
                {
                    if(op.peek() == '*' || op.peek() == '/')
                    {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek() == '*') val.push(v1 * v2);
                        if(op.peek() == '/') val.push(v1 / v2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch); // not multiply or divide
                }
            }
        }
        while(val.size() > 1) // complete all operations
        {
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '-') val.push(v1 - v2);
            if(op.peek() == '+') val.push(v1 + v2);
            if(op.peek() == '*') val.push(v1 * v2);
            if(op.peek() == '/') val.push(v1 / v2);
            op.pop();
        }
        System.out.println("Answer is: " + val.peek());
    }
}
