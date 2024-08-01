package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueueUsingFunctions {
    public static void printQueue(Queue<Integer> que)
    {
        Queue<Integer> helper = new LinkedList<>();
        while(que.size() != 0)
        {
            System.out.println(que.peek());
            helper.add(que.remove());
        }

        while(helper.size() != 0)
        {
            que.add(helper.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.add(70);
        que.add(80);
        que.add(90);
        que.add(100);
        printQueue(que);
    }
}
