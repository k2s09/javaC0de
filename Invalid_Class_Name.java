import java.util.Scanner;

class Invalid_Class_Name {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        while (true) {
            System.out.print("\u000C");
            System.out.println("Enter Class Name");
            String s = Sc.next();
            System.out.println("Invalid Class Name");
            System.out.println("Enter anything to restart or 'exit' to give up");
            String a = Sc.next();
            if (a.equals("exit")) {
                break;
            } else {
                continue;
            }
        }
        System.exit(0);
    }
}
