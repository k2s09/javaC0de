import java.util.Scanner;
public class spiralPrint {
    public static void main(String[] args) {
        // Inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        int c = 1;
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = c++;
            }
        }
        // Full Printing
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Determine the number of layers to be printed, Even = N/2, Odd = (N+1)/2
        // Spiral Print
        int layers = (N % 2 == 0)? (N / 2) : ((N+1)/2);
        for (int i = 0; i < layers; i++) {
            // Top Line
            for (int j = i; j < N-i-1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            // Right Line
            for (int j = i; j < N-i-1; j++) {
                System.out.print(arr[j][N-i-1] + " ");
            }
            // Bottom Line
            for (int j = N-i-1; j > i; j--) {
                System.out.print(arr[N-i-1][j] + " ");
            }
            // Left Line
            for (int j = N-i-1; j > i; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}