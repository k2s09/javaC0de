import java.util.Scanner;

class Palindrome_Number {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = Sc.nextInt();
        int num = n;
        int nn = n;
        double c = 0, sum = 0;
        while (n > 0) {
            n /= 10;
            c++;
        }
        for (int i = 1; i <= c; i++) {
            int rev = (num % 10);
            double r = rev * (Math.pow(10, c));
            sum = sum + rev;
            c--;
        }
        if (sum == n)
            System.out.println("The number is a Palindrome");
        if (sum != n)
            System.out.println("The numbre is not a Palindrome");
    }
}