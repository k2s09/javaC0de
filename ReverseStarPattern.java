import java.util.Scanner;

class ReverseStarPattern {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of iterations");
        int n = Sc.nextInt();
        int i, j;
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }
}