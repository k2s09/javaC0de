// A MOBIUS function M(N) returns the value -1 or 0 or 1 for a natural number (N) by the following conditions are defined:
// When,
// M(N) = 1 if N = 1
// M(N) = 0 if any prime factor of N is contained in N more than once.
// M(N) = (-1)P if N is the product of �P� distinct prime factors.
// Write a program to accept a positive natural number (N) and display the MOBIUS result with proper message.

import java.util.Scanner;

public class mobiusFunction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        sc.close();
        if (num == 1) {
            System.out.println("M(" + num + ") = 1");
            System.exit(0);
        }
        if (duplicatePrimeFactors(num))
            System.out.println("M(" + num + ") = 0");
        else
            System.out.println("M(" + num + ") = -1");
    }

    static boolean duplicatePrimeFactors(int num) {
        // Finding prime factors
        String str = "";
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                str += i;
                num /= i;
            }
        }
        // Finding any duplicates
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = str.indexOf(ch);
            if (index != -1) {
                int index2 = str.indexOf(ch, index + 1);
                if (index2 != -1)
                    return true;
            }
        }
        return false;
    }
}