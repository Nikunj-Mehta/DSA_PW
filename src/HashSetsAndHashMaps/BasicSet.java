package HashSetsAndHashMaps;

import java.util.HashSet;

public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); // This is an interface
        // Insert : TC = O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        System.out.println("Size is: " + set.size());
        set.add(-8);
        set.add(200);
        System.out.println("Size is: " + set.size());

        System.out.println(set); // TC = O(n)

        // Search - true, false : TC = O(1)
        System.out.println(set.contains(100));
        set.add(50);
        System.out.println(set.contains(50));
        System.out.println("Size is: " + set.size());

        // Remove : TC = O(1)
        set.remove(100);
        System.out.println(set);
        System.out.println("Size is: " + set.size());
        set.remove(49);
        System.out.println("Size is: " + set.size());
        // No error will occur it will simply not remove anything

        // Convert this set to array we have an inbuilt function
        Object[] arr = set.toArray(); // We have wrapper integer class so keep it object array
        for(Object ele : arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
