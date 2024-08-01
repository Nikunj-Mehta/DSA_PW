package Trees;

class Node
{
    int val;
    Node left;
    Node right;
    Node(int val)
    {
        this.val = val;
    }
}

public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1); // a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(60);
        Node f = new Node(5);

        System.out.println(a); // it will give the address of a
        System.out.println(a.val); // this will give the value stored in variable a
        // Connections
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        // To change value
        b.val = 41;
        a.left.right.val = 6; // we have changed value of e using a

        Node g = new Node(10);
        Node h = new Node(20);
        c.left = g;
        e.left = h;

        System.out.println(b.val);
        System.out.println(a.left.val);
        System.out.println(e.val);
        System.out.println(a.left.right.val); // this proves out tree is connected
        // To print a tree
        display(a);
        System.out.println();
        System.out.println("The sum of all Nodes of tree is: " + sum(a));
        //a.left = null;
        System.out.println(sum(a));
        System.out.println("The max value is: " + maxValue(a));
        System.out.println("The min value is: " + minValue(a));
        System.out.println("The size of tree is: " + size(a));
        System.out.println("Levels of tree is: " + level(a));
        int height = level(a) - 1;
        System.out.println("Height of tree is: "+ height);
    }
    private static void display(Node root)
    {
        if(root == null) return; // Base Case
        System.out.print(root.val + " "); // self Work
        display(root.left); // Left Subtree    function call
        display(root.right); // Right Subtree  function call
    }

    static int sum(Node root)
    {
        if(root == null) return 0;
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return root.val + leftSum + rightSum;
    }

    private static int maxValue(Node root)
    {
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val, b = maxValue(root.left), c = maxValue(root.right);
        return Math.max(a, Math.max(b, c));
    }

    private static int minValue(Node root)
    {
        if(root == null) return Integer.MAX_VALUE;
        int a = root.val, b = minValue(root.left), c = minValue(root.right);
        return Math.min(a, Math.min(b, c));
    }

    private static int size(Node root)
    {
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static int level(Node root)
    {
        if(root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
}
