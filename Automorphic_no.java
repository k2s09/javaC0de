import java.util.Scanner;

public class Automorphic_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt(), k = n, count = 0;
        while (k > 0) {
            k = k / 10;
            count++;
        }
        k = (n * n) - n;
        if (n % 10 == 0)
            System.out.println(n + " is not a automorphic number");
        else if (k % (10 * count) == 0)
            System.out.println(n + " is a automorphic number");
        else
            System.out.println(n + " is not a automorphic number");
        sc.close();
    }
}
