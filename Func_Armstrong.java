import java.util.Scanner;

class Func_Armstrong {
    int a;
    int b;

    public static void main(String args[]) {
        Func_Armstrong a = new Func_Armstrong();
        a.input();
        a.calculate();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a = sc.nextInt();
        b = a;
    }

    void calculate() {
        int i = 0;
        while (a > 0) {
            int d = a % 10;
            i = i + (d * d * d);
            a /= 10;
        }
        if (i == b) {
            System.out.println("it is an armstrong number");
        }
        if (i != b) {
            System.out.println("it is not an armstrong number");
        }
    }
}
            
        
