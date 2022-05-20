import java.util.Arrays;
import java.util.Scanner;

public class arrRowShift {
    public static void main(String[] args) {
        // Taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r = sc.nextInt();
        System.out.println("Enter columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter " + (r * c) + " elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number of shifts");
        int n = sc.nextInt();
        sc.close();
        // Original Matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        // Shifting the rows
        int tmp;
        for(int k = 1; k <= n; k++) {
            for (int i = 0; i < r ; i++) {
                for (int j = 0; j < c; j++) {
                    tmp = arr[0][j];
                    arr[0][j] = arr[i][j];
                    arr[i][j] = tmp;
                }
            }
        }
        System.out.println("Row Shifted matrix:");
        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}