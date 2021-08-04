import java.util.Scanner;

class DoubleStarPattern {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of iterations");
        int n = Sc.nextInt();
        int i, j, k, l;
        for (k = 5; k >= 1; k--) {
            for (l = 1; l <= k; l++) {
                System.out.print("*" + "   ");
            }
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }
}
