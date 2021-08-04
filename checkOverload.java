public class checkOverload {
    public static void main(String args[]) {
        checkOverload obj = new checkOverload();
        obj.check("success", 's');
        obj.check("computer");
    }

    void check(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char frequency = str.charAt(i);
            if (frequency == ch)
                count += 1;
        }
        System.out.println(count);
    }

    void check(String S1) {
        S1 = S1.toLowerCase();
        for (int i = 0; i < S1.length(); i++) {
            char ch = S1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.print(ch + " ");
        }
    }
}