import java.util.Scanner;

class Resistence_Loop {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter your number ");
        long n = Sc.nextInt();
        long f, v;
        long sum = 1;
        long mus = 1;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            f = (n % 10);
            sum = sum * f;
            n /= 10;
        }
        if (sum < 10) {
            System.out.println(" Resistence of number is 1");
        }
        if (sum > 10) {
            do {
                for (int g = 1; g <= sum; g++) {
                    v = (sum % 10);
                    mus = mus * v;
                    sum /= 10;
                    c++;
                }
            } while (mus < 10);
        }
        System.out.println("Resistence of the number is " + c);
    }
}