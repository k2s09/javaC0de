import java.util.Scanner;

class Divisibility_3 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = Sc.nextInt();
        int j = n, sum = 0;
        while (j > 0) {
            j %= 10;
            sum += j;
            j /= 10;
        }
        if (sum % 3 == 0)
            System.out.println(n + " has passed the divisiblity test");
        else
            System.out.println(n + " could not pass the divisibility test");
    }
}
        
        