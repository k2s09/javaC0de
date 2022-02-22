import java.util.Scanner;
public class josephus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of soldiers in circle, Josephus");
        int n = sc.nextInt();
        int k = n;
        int a = 0;
        while (k > 1) {
            k /= 2;
            a += 1;
        }
        System.out.println(2*(n-Math.pow(2,a)) + 1);
    }
}