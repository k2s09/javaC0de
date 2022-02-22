import java.util.Scanner;
public class spiralArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int n = sc.nextInt();
        sc.close();
        int[][] arr = new int[n][n];
        int top = 0, bottom = n-1, right = n-1, left = 0, direction = 1, counter = 1;
        while (top <= bottom && left <= right) {
            if (direction == 1) {
                for (int i = left; i <= right; i++) {
                    arr[top][i] = counter++;
                }
                ++top;
                direction = 2;
            }
            else if (direction == 2) {
                for (int i = top; i <= bottom; i++) {
                    arr[i][right] = counter++;
                }
                --right;
                direction = 3;
            }
            else if (direction == 3) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = counter++;
                }
                --bottom;
                direction = 4;
            }
            else if (direction == 4) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = counter++;
                }
                ++left;
                direction = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}