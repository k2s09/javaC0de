import java.util.Scanner;

// Compiler version JDK 11.0.2

class bruteforcev2 {
	//Created by jabs 2020 dont distribute
	private static String l;
	private static String q;
	private static String a;
	private static int p;
	private static char[] w;
	private static char[] c;

	public static void main(String args[]) {
		jinit();
	}

	private static void init() {
		Scanner sc = new Scanner(System.in);
		String l = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890#£&_-@()=+':%/*,.!?)$€¥¢~¿[]{} ";
		System.out.println("\nEnter any password: ");

		q = "";
		p = 0;
		a = sc.nextLine();
		w = a.toCharArray();
		c = l.toCharArray();

		System.out.println("\nLoading Brute...\n");
		wait(2000);

		while (!q.equals(a)) {
			for (int i = 0; i < l.length(); i++) {

				System.out.println("[❕] Trying: " + c[i]);

				if (c[i] == w[p]) {
					q += c[i];
					p++;
					System.out.println("[✔️] Found: " + c[i]);
					wait(100);
				}
				wait(30);
				if (q.equals(a)) {
					System.out.println("\n[✔️] Password Found!");
					wait(2000);
					System.out.println("\n/***************************\n[✔️] Password: " + q + "\n/***************************");
					wait(5000);
					System.out.println("\nThank you for trying!\n\nSorry if my algorithm looks crappy\nI am just 15 years old beginner😅\nIf you do enjoy please click the star button\nIf you have any suggestions please email me\n\nEmail: halupapigaming@gmail.com\n\nJabs from the Philippines 🇵🇭");
					break;
				}
			}
		}
	}

	private static void wait(int inv) {
		try {
			Thread.sleep(inv);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void jinit() {
		System.out.println("*****   ******   *    *  *******  **********");
		wait(300);
		System.out.println("*    *  *     *  *    *     *     *        *");
		wait(300);
		System.out.println("*    *  *     *  *    *     *     *        *");
		wait(300);
		System.out.println("*×××*   ******   *    *     *     *****   ***");
		wait(300);
		System.out.println("*    *  *    *   *    *     *     *");
		wait(300);
		System.out.println("*    *  *    *   *    *     *     *");
		wait(300);
		System.out.println("*****   *    *   ******     *     *******");
		wait(1000);
		System.out.println("By: Jabez Torre, 2020");
		wait(1000);
		init();
	}
}