import java.util.Scanner;

public class pronicNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int flag = 0, i;
        for (i = 2; i < num; i++) {
            if (i * (i + 1) == num) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("Num is not pronic");
        else if (flag == 1)
            System.out.println("Num is pronic with " + i + " " + (i + 1));
    }
}