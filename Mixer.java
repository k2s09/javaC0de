import java.util.Scanner;
public class Mixer {
    int[] arr;
    int n;
    Mixer(int nn) {
        n = nn;
        arr = new int[n];
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
    }
    Mixer mix(Mixer A) {
        Mixer mix = new Mixer(A.n+this.n);
        int tmp = 0;
        for (int i = 0; i < A.n+this.n; i++) {
            if (i < n)
                mix.arr[i] = this.arr[i];
            else {
                mix.arr[i] = A.arr[tmp];
                tmp += 1;
            }
        }
        return mix;
    }
    void display() {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String args[]) {
        Mixer A = new Mixer(4);
        Mixer B = new Mixer(5);
        Mixer C = new Mixer(A.n+B.n);
        A.accept();
        B.accept();
        C = B.mix(A);
        C.display();
    }
}