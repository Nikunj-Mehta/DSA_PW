package HashSetsAndHashMaps;

import java.util.HashSet;

public class SetIteration {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 5, 4, 8, 1};
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();

        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        for(int ele : set)
        {
            System.out.print(ele + " ");
//            set.add(1); if we perform any changes in set during iteration it will throw error
//            set.remove(ele); to remove all elements from set we have a function.
        }
        System.out.println();

        set.clear(); // This will remove all elements form our set
        System.out.println(set); // empty
    }
}
