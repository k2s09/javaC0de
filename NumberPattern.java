// Making pattern using numbers

import java.util.Scanner;

class NumberPattern {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of iterations");
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/**
 * Variable Data Table
 * Variable  Data Type  Function
 * n         int        Number of iterations
 * i         int        Used to control loop
 * j         int        Used to control loop
 */