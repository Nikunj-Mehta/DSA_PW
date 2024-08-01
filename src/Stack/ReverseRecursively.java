package Stack;

import java.util.Stack;

public class ReverseRecursively
{
    public static void reverseRecursively(Stack<Integer> st)
    {
        if(st.isEmpty()) return; // Base Case
        int top = st.pop();
        // System.out.println(top); // work // to print in reverse  order
        reverseRecursively(st);// Function call recursive
        System.out.println(top); // to print in same order
        st.push(top); // to add ele back in stack
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        reverseRecursively(st);

        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st); // this is Stack underflow
    }
}
