// Design a program which tells the date in dd/mm/yyyy format taking input only the date of the year and the year

import java.util.Scanner;

public class date {
	static String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
	static int cumulativeDays[] = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
	static int monthNo = 0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date of the year");
		int doy = sc.nextInt();
		System.out.println("Enter year");
		int year = sc.nextInt();
		if (isItLeapYear(year)) {
			cumulativeDays[1] = 29;
			cumulativeDays[12] = 366;
		}
		System.out.println(isItLeapYear(year) + "\n" + determineMonth(doy) + "\n" + monthNo);
	}

	public static boolean isItLeapYear(int n) {
		if (n % 4 == 0) {
			if (n % 100 == 0) {
				if (n % 400 == 0) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}

	public static String determineMonth(int date) {
		for (int i = 0; i < cumulativeDays.length - 1; i++) {
			if (date > cumulativeDays[i] && date <= cumulativeDays[i + 1]) {
				monthNo = i;
				return month[i];
			}
		}
		return "";
	}
}