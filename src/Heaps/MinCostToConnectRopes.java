package Heaps;

import java.util.PriorityQueue;

public class MinCostToConnectRopes {
    private static int minCost(int[] arr)
    {
        // MinHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr)
        {
            pq.add(ele);
        }
        int cost = 0;
        while(pq.size() > 1)
        {
            int top = pq.remove();
            int secTop = pq.remove();
            cost += (top + secTop);
            pq.add(top + secTop);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 1, 8};
        System.out.println(minCost(arr));
    }
}
