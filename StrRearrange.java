import java.util.Scanner;

public class StrRearrange {

    String Txt;
    String Cxt;
    int len;

    StrRearrange() {
        Txt = "";
        Cxt = "";
        len = 0;
    }

    public static void main(String[] args) {
        StrRearrange obj = new StrRearrange();
        obj.readWord();
        obj.convert();
        obj.display();
    }

    void readWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word in uppercase: ");
        Txt = sc.next();
        len = Txt.length();
        sc.close();
    }

    void convert() {
        char ch = Txt.charAt(0);
        // First case
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            Cxt = Txt + 'Y';
        }
        // Third case
        else if (!Txt.contains("A") && !Txt.contains("E") && !Txt.contains("I") && !Txt.contains("O") && !Txt.contains("U")) {
            Cxt = Txt + 'N';
        }
        // Second case
        else {
            // find index of first vowel
            int index = 0;
            for (int i = 1; i < Txt.length(); i++) {
                ch = Txt.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    index = i;
                    break;
                }
            }
            Cxt = Txt.substring(index) + Txt.substring(0, index) + 'C';
        }
    }

    void display() {
        System.out.println(Txt + "\n" + Cxt);
    }
}

// priyankalalwani2502@gmail.com
