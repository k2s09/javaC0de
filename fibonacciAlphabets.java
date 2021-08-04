import java.util.Scanner;

public class fibonacciAlphabets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        int counter = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numberToAlphabet(fibonacci(counter)) + " ");
                ++counter;
            }
            System.out.println();
        }
    }

    static int fibonacci(int nth) {
        final double Phi = (1 + Math.sqrt(5)) / 2;
        final double phi = (1 - Math.sqrt(5)) / 2;
        return (int) ((Math.abs(Math.pow(Phi, nth) - Math.pow(phi, nth))) / Math.sqrt(5));
    }

    static char numberToAlphabet(int num) {
        num = num % 26;
        return (char) (num + 64);
    }
}