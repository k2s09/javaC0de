import java.util.Scanner;

class Mulaah {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int num[] = new int[5];
        int sum = 0;
        int i = 0;
        for (i = 0; i < 5; i++) {
            num[i] = Sc.nextInt();
            sum += num[i];
        }
        int avg = sum / 5;
        System.out.println(avg + " is the average");
    }
}

