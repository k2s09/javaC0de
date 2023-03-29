// Spiral printing an NxN matrix
public class spiralPrint {
    static int N = 4;
    public static void main(String[] args) {

        // Inputs
        int[][] arr = new int[N][N];
        int c = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = ++c;
            }
        }
        printSpiral(arr);
        // Spiral printing
        // Top Line
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i][0] + " ");
        }
        // Right Line
        for (int i = 1; i < N; i++) {
            System.out.print(arr[N-1][i] + " ");
        }
        // Bottom Line
        for (int i = N-2; i >= 0; i--) {
            System.out.print(arr[i][N-1]);
        }
        // Left Line
        for(int i = N-2; i >= 1; i--) {
            System.out.print(arr[0][i]);
        }
    }
    static void printSpiral(int[][] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
