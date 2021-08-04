// C(line, i)   = line! / ( (line-i)! * i! ) 

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in triangle");
        int rows = sc.nextInt();
        for (int line = 1; line <= rows; line++) {
            for (int i = 1; i <= rows; i++) {
                System.out.print(binomialCoefficient(line, i) + " ");
            }
        }
    }

    public static int factorial(int val) {
        int product = 1;
        for (int i = 2; i <= val; i++) {
            product *= i;
        }
        return product;
    }

    public static int binomialCoefficient(int line, int i) {
        int C = (factorial(line)) / ((factorial(line - i)) * factorial(i));
        return C;
    }
}