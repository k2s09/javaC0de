import java.util.Scanner;
public class arrFill {
    public static void main(String args[]) {
        // Inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int N = sc.nextInt();
        if (N < 3 || N > 10) {
            System.out.println("SIZE OUT OF RANGE");
            System.exit(0);
        }
        System.out.print("FIRST CHARACTER: ");
        char c1 = sc.next().charAt(0);
        System.out.print("Second CHARACTER: ");
        char c2 = sc.next().charAt(0);
        System.out.print("THIRD CHARACTER: ");
        char c3 = sc.next().charAt(0);
        sc.close();
        char[][] M = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == N-1) || (i == N-1 && j == 0) || (i == N-1 && j == N-1))
                    M[i][j] = c1;
                else if (i != 0 && i != N-1 && j != 0 && j != N-1)
                    M[i][j] = c3;
                else
                    M[i][j] = c2;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}