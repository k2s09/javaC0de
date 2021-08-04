import java.util.Scanner;

class OddArray {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter number of iterations ");
        int n = Sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(sum);
            sum += 2;
        }
    }
}
            