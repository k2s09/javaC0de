// Make a program that finds all prime adam numbers in a range

import java.util.Scanner;

public class primeAdam {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower boundary of range: ");
        int l = sc.nextInt();
        System.out.println("Enter higher boundary of range: ");
        int h = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = l; i < h; i++) {
            if (isPrime(i) && isAdam(i)) {
                System.out.println(i + " ");
                count += 1;
            }
        }
        System.out.println("\nCount: " + count);
    }

    static boolean isPrime(int num) {
        int flag = 0;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag += 1;
                break;
            }
        }
        if (flag == 0)
            return true;
        else
            return false;
    }

    static boolean isAdam(int num) { // 13
        int square = num * num; // 169
        int squareReverse = Integer.valueOf(new StringBuffer(String.valueOf(square)).reverse().toString()); // 961
        int reverse = Integer.valueOf(new StringBuffer(String.valueOf(num)).reverse().toString()); // 31
        int reverseSquare = reverse * reverse; // 961
        return (squareReverse == reverseSquare);
    }
}