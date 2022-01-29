import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkLogin {
	public static void main(String args[]) throws FileNotFoundException {

		File f = new File("C:\\Users\\Kavin\\eclipse-workspace\\JavaProject\\Details.txt");
		Scanner fileScan = new Scanner(f);

		Scanner check = new Scanner(System.in);
		System.out.print("Enter your id: ");
		String id = check.next();
		System.out.print("Enter your password: ");
		String password = check.next();

		String idCheck = fileScan.nextLine();
		String passCheck = fileScan.nextLine();
		if (idCheck.equals(id) && passCheck.equals(password))
			System.out.println("Welcome, " + id);
		else
			System.out.println("Wrong id or password.");

		fileScan.close();
		check.close();
	}
}
