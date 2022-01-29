import java.util.Scanner;
public class Matrix {
    int[][] arr;
    int m;
    int n;
    Matrix(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }
    void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + (m*n) + " elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    Matrix SubMat(Matrix A) {
        Matrix C = new Matrix(3,3);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C.arr[i][j] = this.arr[i][j] - A.arr[i][j];
            }
        }
        return C;
    }
    void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Matrix A = new Matrix(3,3);
        Matrix B = new Matrix(3,3);
        Matrix C = new Matrix(3,3);
        A.fillarray();
        B.fillarray();
        C = B.SubMat(A);
        C.display();
    }
}