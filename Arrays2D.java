// Program utilizing 2D arrays

import java.util.Scanner;

class Arrays2D {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = Sc.nextInt();
        System.out.println("Enter number of columns");
        int c = Sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter " + (r * c) + " elements for your array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }
        System.out.println("\nSum of rows:\n");
        int sumR = 0, sumC = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sumR += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sumR);
            sumR = 0;
        }
        System.out.println("\nSum of columns\n");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                sumC += arr[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + " = " + sumC);
            sumC = 0;
        }
        System.out.println("\nSum of left diagonals\n");
        int dL = 0, dR = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                    dL += arr[i][j];
                }
            }
        }
        System.out.println(dL);
        System.out.println("\nSum of right diagonals\n");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i + j == (r - 1)) {
                    System.out.print(arr[i][j] + " ");
                    dR += arr[i][j];
                }
            }
        }
        System.out.println(dR);
    }
}
/**
 * Variable Data Table
 * Variable    Data type   Function
 * r           int         To store number of rows
 * c           int         To store number of columns
 * arr[][]     int         Used in calculation
 * sumR, sumL  int         Used to find sum of rows and columns
 * dL, dR      int         Used to find sum of left and right diagonals
 */
