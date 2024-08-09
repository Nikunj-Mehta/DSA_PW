package Heaps;

import java.util.*;

public class NearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9}; // Each ele is at max 3 positions from it's sorted position
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> ans = new ArrayList<>();
        for(int ele : arr)
        {
            pq.add(ele);
            if(pq.size() > k) ans.add(pq.remove());
        }
        while(!pq.isEmpty())
        {
            ans.add(pq.remove());
        }
        System.out.println(ans);
    }
}
