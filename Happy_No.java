import java.util.Scanner;

public class Happy_No {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt(), dig = 0, count = 0, k = n;
        do {
            count = 0;
            int sum = 0;
            while (n > 0) {
                dig = n % 10;
                sum += dig * dig;
                n /= 10;
            }
            n = sum;
            while (sum > 0) {
                sum /= 10;
                count++;
            }
        }
        while (count != 1);
        if (n == 1)
            System.out.println(k + " is a happy number");
        else
            System.out.println(k + " is not a happy number");
    }
}
