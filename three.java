// Largest prime factor of the number 600851475143
public class three {
    public static void main(String args[]) {
        final long chonker = 600851475143l;
        long i = (int) (Math.floor(600851475143.0 / 2.0));
        for (; i >= 2; i--) {
            if (chonker % i == 0) {
                if (isPrime(i)) {
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
    }

    public static boolean isPrime(long num) {
        int flag = 0;
        for (long i = 2l; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        if (flag == 0)
            return true;
        else
            return false;
    }
}
