import java.time.LocalTime;
import java.util.Scanner;

public class fibonacciBeauty {
    static double start;
    static double end;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        formula(n);
        loop(n);
    }

    public static void formula(int n) {
        start = LocalTime.now().toNanoOfDay();
        double goldenNumber = (Math.sqrt(5.0) + 1.0) / 2.0;
        double Fn = Math.round(Math.pow(goldenNumber, n) / Math.sqrt(5.0));
        System.out.println(Fn);
        end = LocalTime.now().toNanoOfDay();
        System.out.println("-------------------------" + (end - start));
    }

    public static void loop(int n) {
        start = LocalTime.now().toNanoOfDay();
        int j = 0, k = 1, temp = 0;
        for (int i = 0; i <= n; i++) {
            temp = j + k;
            end = LocalTime.now().toNanoOfDay();
            System.out.println("-------------------------" + (end - start));
        }
    }
}