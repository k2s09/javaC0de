import java.util.Scanner;

class Fibonacci {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter number of iterations ");
        int n = Sc.nextInt();
        int j = 0;
        int k = 1;
        int sum = 0;
        System.out.println(j + "\n" + k);
        for (int i = 1; i <= (n - 2); i++) {
            sum = j + k;
            j = k;
            k = sum;
            System.out.println(sum);
        }
        int kk = Sc.nextInt();
        System.out.println("Ratio of last two numbers in the series : " + (sum / j));
    }
}