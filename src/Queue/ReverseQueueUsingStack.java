package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {
    public static void reverseQueue(Queue<Integer> que)
    {
        Stack<Integer> st = new Stack<>();
        // First remove ele from queue and push them in stack
        while(!que.isEmpty()) // while loop will run untill queue is not empty, if queue is empty loop breaks.
        {
            st.push(que.remove());
        }
        //System.out.println(st);
        // Now pop the elements from stack and add them in queue
        while(!st.isEmpty())
        {
            que.add(st.pop());
        }
        System.out.println("Reversed queue: " + que); // queue is reversed
    }

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();


        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println("Original queue: " + que);
        reverseQueue(que);
    }
}
