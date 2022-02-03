public class chinty {
    public static void main(String[] args) {
        confusing(24, 2);
    }
    static void confusing(int m, int n) {
        if (m > 1) {
            if (m % n == 0) {
                System.out.println(n + "");
                confusing(m/n, n);
            }
            else {
                confusing(m, n+1);
            }
        }
    }
}
