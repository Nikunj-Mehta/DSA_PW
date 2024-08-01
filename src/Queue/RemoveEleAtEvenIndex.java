package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveEleAtEvenIndex {
    public static void removeEleFromEvenIndex(Queue<Integer> que)
    {
        Queue<Integer> helper = new LinkedList<>();
        while(!que.isEmpty())
        {
            que.remove(); // elements at 0th index is removed, same repeated for 2nd, 4th, ..., even indices.
            helper.add(que.remove()); // element at 1st index is added, same is repeated for index 3rd, 5th, ... all odd indices.
        }
        // Now again add all elements from helper to original queue
        while(!helper.isEmpty())
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
        System.out.println(que);
        removeEleFromEvenIndex(que);
        System.out.println(que);
    }
}
