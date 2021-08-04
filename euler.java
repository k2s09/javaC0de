// e = 1 + 1 / 1! + 1 / 2! + 1 / 3! + … 1 / n!

import java.util.Scanner;

public class euler {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        double e = 1;
        for (int i = 1; i <= n; i++) {
            // Finding factorial
            int product = 1, j;
            for (j = 2; j <= i; j++) {
                product *= j;
            }
            e += 1 / j;
        }
        System.out.println(e);
    }
}