package HashSetsAndHashMaps;

import java.util.HashSet;

public class AddSameInSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Nikunj");
        set.add("Om");
        set.add("Himanshu");
        System.out.println("Size of set is: " + set.size());
        System.out.println(set);
        set.add("Nikunj"); // Ek ele bs 1 he baar rhega set m kitni baar bhi add kro rhega to 1 he baar
        set.add("Nikunj");
        System.out.println("Size of set is: " + set.size());
        System.out.println(set);
        set.remove("Nikunj"); // 1 he baar remove krne se hatt jyega
        System.out.println("Size of set is: " + set.size());
        System.out.println(set);
    }
}
