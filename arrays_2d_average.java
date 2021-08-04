// Make a two dimentional array with same number of rows and columns
// Find the average and print number of values above and below average

import java.util.Scanner;

public class arrays_2d_average {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = Sc.nextInt();
        int arr[][] = new int[n][n];
        int sum = 0;
        System.out.println("Enter " + (n * n) + " values");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Sc.nextInt();
                sum += arr[i][j];
            }
        }
        double average = sum / (n * n);
        int aboveAVR = 0, belowAVR = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > average)
                    aboveAVR += 1;
                else if (arr[i][j] < average)
                    belowAVR += 1;
            }
        }
        System.out.println(aboveAVR + " numbers are above average");
        System.out.println(belowAVR + " numbers are below average");
    }
}
