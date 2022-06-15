// Program to encrypt and decrypt user data with a key

import java.util.Scanner;

class encryption {
	static boolean b;

	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter user data: ");
		String input = Sc.nextLine();
		System.out.print("Enter encryption key: ");
		String key = Sc.nextLine();

		// Encryption process - Convert lowerCase to upperCase and vice versa
		String encryption = "";
		char ch = ' ';
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			b = Character.isUpperCase(ch);
			if (b == true) {
				ch = Character.toLowerCase(ch);
			} else if (b == false) {
				ch = Character.toUpperCase(ch);
			}
			encryption += ch;
		}
		//Destroying original user data
		input = "";
		String decrypt = "";
		System.out.println("Encrypted file: " + encryption);
		System.out.print("Enter key: ");
		String key_check = Sc.nextLine();
		int flag = 0;
		if (key_check.equals(key)) {
			flag += 1;
			for (int i = 0; i < encryption.length(); i++) {
				ch = encryption.charAt(i);
				b = Character.isUpperCase(ch);
				if (b == true) {
					ch = Character.toLowerCase(ch);
				} else if (b == false) {
					ch = Character.toUpperCase(ch);
				}
				decrypt += ch;
			}
			System.out.println("Decrypted file: " + decrypt);
		}
		if (flag == 0) {
			System.out.println("Wrong pass sentence. If you genuinely forgot the key, you're in for trouble ;) HAHAHA");
		}
	}
}
    
    
        
