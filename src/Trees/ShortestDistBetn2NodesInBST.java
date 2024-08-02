package Trees;

import java.util.Scanner;

public class ShortestDistBetn2NodesInBST {

    private static void preorder(Node root)
    {
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);  // If we swap these 2 lines then
        preorder(root.right); // it becomes reverse preorder
    }

    private static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root.left == null || root.right == null) return root; //no need
        if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q); // p and q are less than root then go left
        if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q); // p and q are greater than root go right
        else return root;
        // value of p is less than root and value of q is greater than root and vice versa, root will be LCA
    }

    private static int findDistance(Node root, int value)
    {
        if(root == null) return -1;

        if(root.val == value) return 0;

        else if(root.val > value)
        {
            int leftDistance = findDistance(root.left, value);
            if(leftDistance != -1) return leftDistance + 1;
            else return -1;
        }
        else // root.val < value
        {
            int rightDistance = findDistance(root.right, value);
            if(rightDistance != -1) return rightDistance + 1;
            else return -1;
        }
    }

    private static int shortestDistance(Node root, int value1, int value2)
    {
        Node LCA = lowestCommonAncestor(root, new Node(value1), new Node(value2));
        int distance1 = findDistance(LCA, value1);
        int distance2 = findDistance(LCA, value2);
        return distance1 + distance2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(8);
        Node d = new Node(1);
        Node e = new Node(4);
        Node f = new Node(6);
        Node g = new Node(9);
        Node h = new Node(3);
        Node i = new Node(7);
        Node j = new Node(10);
        // Connections
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h;
        f.right = i;
        g.right = j;

        // First display values present in tree
        System.out.println("Values in tree are: ");
        preorder(a);
        System.out.println();
         // Lowest Common Ancestor se krnge
        System.out.print("Enter the value of 1st Node: ");
        int value1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter the value of 2nd Node: ");
        int value2 = sc.nextInt();

        int distance = shortestDistance(a, value1, value2);
        System.out.println("Shortest distance between "+ value1 + " and " + value2 + " is; " + distance);
    }
}
