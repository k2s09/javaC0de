// Multiplication of two matrices of order 2x2

import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inputs
        System.out.println("Enter elements of first matrix A");
        int[][] A = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("A(" + (1 + i) + "," + (1 + j) + ")");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix B");
        int[][] B = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("A(" + (1 + i) + "," + (1 + j) + ")");
                B[i][j] = sc.nextInt();
            }
        }
    }
}
