import java.util.Scanner;

class encryption2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Storing client data
		System.out.print("Enter data: ");
		String data = sc.nextLine();
		System.out.print("Enter custom integer key: ");
		int key = sc.nextInt();

		String newData = "";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			ch += (char) (key);
			newData += ch;
		}

		System.out.println("Encrypted data: " + newData);
	}
}