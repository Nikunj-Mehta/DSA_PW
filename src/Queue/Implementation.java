package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        System.out.println(que.isEmpty());
        // add or push operation
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que); // To print queue
        System.out.println(que.remove()); // To remove the first added ele as queue is fifo
        System.out.println(que);
        que.poll(); // Another method to remove first added ele i.e. ele at front
        System.out.println(que);
        System.out.println(que.peek()); // To see the ele present in front of a queue
        System.out.println(que.size()); // To get the size of queue
        System.out.println(que.isEmpty());
    }
}
