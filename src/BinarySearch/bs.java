package BinarySearch;
import java.util.Scanner;

public class bs{
    public static void main(String[] args) {
        int[] arr = {10, 37, 47, 58, 68, 89, 338, 3737};
        for(int ele: arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int high, low, n;
        n = arr.length;
        low= 0;
        high = n-1;
        boolean flag = false;
        int iterations = 0;

        while(low <= high)
        {
            int mid = (high+low)/2;
            iterations++;

            if(target == arr[mid])
            {
                flag = true;
                break;
            }
            else if(target < arr[mid]) high = mid - 1;  //Go left
            else if(target> arr[mid])  low = mid + 1;   //Go right
        }
        if(flag == false)
        {
            System.out.println("Element not present in array");
        }
        else
        {
            System.out.println("Element found");
            System.out.println("Number of iterations: "+ iterations);
        }
    }
}