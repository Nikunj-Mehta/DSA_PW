package HashSetsAndHashMaps;

import java.util.HashMap;

public class BasicMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Insert key and value pair / updates : TC = O(1)
        map.put("Nikunj", 76); // Pairs
        map.put("Himanshu", 27);
        map.put("Om", 45);
        map.put("Jagrut", 53);
        System.out.println(map + " " + map.size()); // Adds in random order
        map.put("Nikunj", 100); // Replaces overwrites the previous value
        System.out.println(map+ " " + map.size());
        map.put("Kartik", 45); // This is possible, value can be repeated but key can't.

        // Searching for key
        System.out.println(map.containsKey("Nikunj"));
        System.out.println(map.containsKey("Nitesh"));
        System.out.println(map.containsKey("NIkunj")); // Case Sensitive
        // Searching for value
        System.out.println(map.containsValue(45));
        System.out.println(map.containsValue(32));

        // Remove : removes the pair
        map.remove("Nikunj");
        System.out.println(map + " " + map.size());
        map.remove("Shravan"); // If we try to remove the ele which is not present no error will be thrown
        System.out.println(map + " " + map.size());

        // Get : gives the value of that key, and not gives key if entered value
        System.out.println(map.get("Himanshu"));
        System.out.println(map.get(45)); // one value can be assigned to multiple keys so it will not work.
    }
}
