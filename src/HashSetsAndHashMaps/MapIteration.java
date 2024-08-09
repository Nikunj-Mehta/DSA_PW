package HashSetsAndHashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class MapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Insert key and value pair / updates : TC = O(1)
        map.put("Nikunj", 76); // Pairs
        map.put("Himanshu", 27);
        map.put("Om", 45);
        map.put("Jagrut", 53);
        map.put("Kartik", 45);
        System.out.println(map); // but this is not iteration
        System.out.println(map.get("Nikunj"));
        // Iteration on keys
        for(String key : map.keySet()) // this is a set of all key. Most Useful
        {
//            System.out.print(key + " "); // for printing of keys
//            System.out.println(map.get(key)); // for printing values
            int val = map.get(key);
            System.out.println(key + " " + val);
        }
        System.out.println();

        // Iteration on values
        for(int val : map.values()) // set of all values Not useful
        {
            System.out.println(val); // agar 2 keys ko same value ho to utni baar print hoga
        }
        System.out.println();

        // Entry set
        for(Object pair: map.entrySet()) // Poora map Not useful
        {
            System.out.println(pair);
        }
    }
}
