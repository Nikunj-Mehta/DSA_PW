package HashSetsAndHashMaps;
import java.util.TreeSet;

public class TreeSetIteration {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        // Elements will be displayed in sorted order always.
        for(int ele : set)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
