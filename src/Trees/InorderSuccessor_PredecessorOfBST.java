package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InorderSuccessor_PredecessorOfBST {
    private static void inorder(Node a, List<Integer> arr)
    {
        if(a == null) return;
        inorder(a.left, arr);
        arr.add(a.val);
        inorder(a.right, arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(50);
        Node b = new Node(30);
        Node c = new Node(70);
        Node d = new Node(20);
        Node e = new Node(40);
        Node f = new Node(60);
        Node g = new Node(80);
        // Connections
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        List<Integer> arr = new ArrayList<>();
        inorder(a, arr);
        System.out.print("Enter the value whos'e inorder successor and predecessor is to be found: ");
        int n = sc.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == n) {
                String predecessor = (i - 1 >= 0) ? String.valueOf(arr.get(i - 1)) : "None";
                String successor = (i + 1 < arr.size()) ? String.valueOf(arr.get(i + 1)) : "None";
                System.out.println("Inorder Predecessor is: " + predecessor);
                System.out.println("Inorder successor is: " + successor);
                break;
            }
        }
    }
}
