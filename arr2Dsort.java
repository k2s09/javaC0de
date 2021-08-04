import java.util.Arrays;
import java.util.Scanner;
public class arr2Dsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int[] ar = new int[r * c];
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                ar[count] = arr[i][j];
                ++count;
            }
        }
        // Sorting 1d array
        int min, temp;
        for (int i = 0; i < ar.length; i++) {
            min = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[min]) {
                    min = j;
                }
            }
            if (ar[i] != ar[min]) {
                temp = ar[i];
                ar[i] = ar[min];
                ar[min] = temp;
            }
        }
        System.out.println(Arrays.toString(ar));
        // Putting elements of 1d in 2d
        count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = ar[count];
                ++count;
            }
        }
        // Printing the final output
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}