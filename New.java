import java.util.Scanner;

class New {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = 4;
        System.out.println(a + (++a) + (++a) + (a++) + a);
        Sc.close();
    }
}
