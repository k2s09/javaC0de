// Prints fizz if number is divisible by 3, buzz if divisible by 5, and fizzbuzz if by both

import java.util.Scanner;

class FizzBuzz {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter how many numbers do you want: ");
        int numbers = Sc.nextInt();
        String result = "";
        for (int i = 1; i <= numbers; i++) {
            if (i % 3 == 0)
                result += "Fizz";
            if (i % 5 == 0)
                result += "Buzz";
            if (i % 3 != 0 && i % 5 != 0)
                result += i;
            System.out.println(result);
            result = "";
        }
    }
}
/**
 * Variable Data Table
 * Variable    Data type   Function
 * number      int         Used to store number of iterations
 * result      String      Used to store result
 * i           int         Used to control loop iterations
 */