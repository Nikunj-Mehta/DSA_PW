package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirst_K_Elements {
    public static void reverseKEle(Queue<Integer> que, int k)
    {
        // Use an auxiliary Stack
        Stack<Integer> st = new Stack<>();
        int n = que.size() - k;
        for(int i = 0; i < k; i++)
        {
            st.push(que.remove());
        }
        while(!st.isEmpty())
        {
            que.add(st.pop());
        }
        for(int i = 0; i < n; i++)
        {
            que.add(que.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que);
        reverseKEle(que, 4);
        System.out.println(que);
    }
}
