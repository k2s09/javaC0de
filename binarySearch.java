import java.util.*;
public class binarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter " + len + " elements");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search element: ");
        int element = sc.nextInt();
        sc.close();
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, element));
    }
}