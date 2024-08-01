package Trees;

public class ProductOfTreeNodes {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(4);
        Node e = new Node(8);
        Node f = new Node(2);
        Node g = new Node(3);
        Node h = new Node(17);
        Node i = new Node(0);
        // Connections
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h;
        g.right = i;
        System.out.println("Product of nodes of tree is: " + product(a));
        System.out.println("Product of non zero elements is: " + productOfNonZero(a));
        System.out.println("The maximum value of node is: " + maxValue(a));
    }
    private static int product(Node root)
    {
        if(root == null) return 1; // Base Case
        return root.val * product(root.left) * product(root.right);
    }

    private static int productOfNonZero(Node root)
    {
        if(root == null) return 1;
        if(root.val > 0)
            return root.val * productOfNonZero(root.left) * productOfNonZero(root.right);
        else return productOfNonZero(root.left) * productOfNonZero(root.right);
    }

    private static int maxValue(Node root)
    {
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val, b = maxValue(root.left), c = maxValue(root.right);
        return Math.max(a, Math.max(b, c));
    }
}
