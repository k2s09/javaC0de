import java.util.Scanner;

public class Modify {
    String str;
    int length;

    public static void main(String args[]) {
        Modify obj = new Modify();
        obj.read();
        obj.putin(1, 'A');
        obj.takeout(1);
        obj.change();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word in uppercase");
        str = sc.next();
        sc.close();
        length = str.length();
    }

    void putin(int i, char ch) {
        // Insert character in specific position and display string
        StringBuffer sb = new StringBuffer(str);
        sb.insert(i, ch);
        System.out.println(sb);
    }

    void takeout(int i) {
        StringBuffer sb = new StringBuffer(str);
        sb.deleteCharAt(i);
        System.out.println(sb);
    }

    void change() {
        String temp = "";
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch != 'Y' && ch != 'Z')
                temp += (char) (ch + 2);
            else if (ch == 'Y')
                temp += 'A';
            else if (ch == 'Z')
                temp += 'B';
        }
        System.out.println("Original word: " + str + "\nNew word: " + temp);
    }
}
