import java.util.Scanner;

class Pattern_Loopings_5 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of iterations");
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  " + j);
            }
            System.out.println();

        }
    }
}