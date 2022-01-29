import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class javaLogin {
	public static void main(String args[]) throws IOException {
		Scanner Sc = new Scanner(System.in);
		FileWriter writer = new FileWriter("details.txt");

		System.out.print("Set id: ");
		String id = Sc.next();
		System.out.print("Set password: ");
		String password = Sc.next();

		writer.write(id);
		writer.write("\n" + password);

		writer.close();

		try {
			File f = new File("details.txt");
			Scanner fileScan = new Scanner(f);

			System.out.print("Enter your id: ");
			String ID = Sc.next();
			System.out.print("Enter your password: ");
			String PASSWORD = Sc.next();

			String idCheck = fileScan.nextLine();
			String passCheck = fileScan.nextLine();
			if (idCheck.equals(ID) && passCheck.equals(PASSWORD))
				System.out.println("Welcome, " + ID);
			else
				System.out.println("Wrong id or password.");

			fileScan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Sc.close();
	}
}
