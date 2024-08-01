package Recursion;

public class arrayTraversal {
    public static void print(int i, int[] arr)
    {
        if(i == arr.length) return; // Base case
        System.out.print(arr[i]+ " "); // work
        print(i + 1, arr); // function call
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 3, 5, 2, 34, 65};
        print(0, arr);
    }
}
