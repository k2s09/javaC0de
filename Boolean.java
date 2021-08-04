import java.util.Scanner;

class Boolean {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Java uses Unicode (true/false)");
        boolean a = Sc.nextBoolean();
        if (a == true) {
            ++count;
        }
        System.out.println("Java class names can include ampersand(s). (true/false)");
        boolean b = Sc.nextBoolean();
        if (b == false) {
            ++count;
        }
        System.out.println("To clear output screen, press Ctrl + K (true/false)");
        boolean c = Sc.nextBoolean();
        if (c == true) {
            ++count;
        }
        System.out.println("Smallest individual unit in a program is called an object (true/false)");
        boolean d = Sc.nextBoolean();
        if (d == false) {
            ++count;
        }
        System.out.println(" Your score is " + count + " out of 4");
    }
}


