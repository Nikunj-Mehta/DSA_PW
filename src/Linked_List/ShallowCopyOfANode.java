package Linked_List;

public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(100);
        // Node temp = a; // Shallow Copy
        Node temp = new Node(100); // Deep copy
        System.out.println(a);
        System.out.println(temp);
    }
}
