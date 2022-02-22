// A disarium number is a number in which the sum of the 
// digits to the power of their respective position is equal 
// to the number itself (position is counted from left to right starting from 1).
public class Disarium {
    int num, size;
    Disarium(int nn) {
        num = nn;
        size = 0;
    }
    void countDigit() {
        size = String.valueOf(num).length();
    }
    int sumOfDigits(int n, int p) {
        if (p == 0)
            return 0;
        else
            return (int)(Math.pow(n % 10, p)) + sumOfDigits(n/10 , p-1);
    }
    void check() {
        if (num == sumOfDigits(num, size))
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static void main(String args[]) {
        Disarium o = new Disarium(135);
        o.countDigit();
        o.check();
        System.out.println(o.sumOfDigits(135, 3));
    }
}