package HashSetsAndHashMaps;

import java.util.TreeMap;

public class TreeMapIteration {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        // Insert key and value pair / updates : TC = O(1)
        map.put("Nikunj", 76); // Pairs
        map.put("Himanshu", 27);
        map.put("Om", 45);
        map.put("Jagrut", 53);
        map.put("Kartik", 45);
        System.out.println(map); // but this is not iteration
        System.out.println(map.get("Nikunj"));
        // Iteration on keys
        // Pairs will be returned sorted by key and not on values according to their ascii values.
        for (String key : map.keySet()) // this is a set of all key. Most Useful
        {
            int val = map.get(key);
            System.out.println(key + " " + val);
        }
        System.out.println();
    }
}
