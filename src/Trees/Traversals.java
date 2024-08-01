package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//
public class Traversals {
    public static class Pair
    {
        Node node;
        int level;
        Pair(Node node, int level)
        {
            this.node = node;
            this.level = level;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h;
        f.right = i;

        System.out.print("Preorder: ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder: ");
        postorder(a);
        System.out.println();
        System.out.println("Level order i.e. BFS: ");
        levelOrder(a);
        System.out.println();
        System.out.println("Nth Level Elements: ");
        for(int x = 0; x <= 3; x ++)
        {
            nThLevelEle(a, 0, x);
            System.out.println();
        }

    }
    private static void preorder(Node root)
    {
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);  // If we swap these 2 lines then
        preorder(root.right); // it becomes reverse preorder
    }

    private static void inorder(Node root)
    {
        if(root == null) return;
        inorder(root.left);   // If we swap these 2 lines then
        System.out.print(root.val + " ");
        inorder(root.right);  // it becomes reverse inorder
    }

    private static void postorder(Node root)
    {
        if(root == null) return;
        postorder(root.left);  // If we swap these 2 lines then
        postorder(root.right); // it becomes reverse postorder
        System.out.print(root.val + " ");
    }

    private static void levelOrder(Node root)
    {
        int previousLevel = 0;
        Queue<Pair> que = new LinkedList<>();
        if(root != null) que.add(new Pair(root, 0));
        while(!que.isEmpty())
        {
            Pair front = que.remove(); // Queue se remove bhi pair he hoga to pair {node, level} dono hai
            Node temp = front.node;
            int lvl = front.level;
            if(lvl != previousLevel)
            {
                System.out.println();
                previousLevel++;
            }
            System.out.print(temp.val + " ");
            if(temp.left != null) que.add(new Pair(temp.left, lvl + 1));
            if(temp.right != null) que.add(new Pair(temp.right, lvl + 1));
        }
    }
    // We can print level order by using this function in loop we must know our no. of levels
    private static void nThLevelEle(Node root, int level, int lvl)
    {
        if(root == null) return;
        if(level == lvl)System.out.print(root.val + " ");
        nThLevelEle(root.left, level + 1, lvl);  // If we swap these 2 lines then
        nThLevelEle(root.right, level + 1, lvl); // it becomes reverse preorder
    }
}
