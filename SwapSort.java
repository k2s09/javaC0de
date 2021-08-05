import java.util.Arrays;
import java.util.Scanner;

public class SwapSort {
	String wrd;
	int len;
	String swapwrd;
	String sortwrd;

	SwapSort() {
		wrd = "";
		len = 0;
		swapwrd = "";
		sortwrd = "";
	}

	public static void main(String[] args) {
		SwapSort o = new SwapSort();
		o.readword();
		o.swapchar();
		o.sortword();
		o.display();
	}

	void readword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word: ");
		wrd = sc.next();
	}

	void swapchar() {
		swapwrd = wrd.charAt(wrd.length() - 1) + wrd.substring(1, wrd.length() - 1) + wrd.charAt(0);
	}

	void sortword() {
		char[] arr = wrd.toCharArray();
		Arrays.sort(arr);
		sortwrd = Arrays.toString(arr);
	}

	void display() {
		System.out.println("Original word: " + wrd);
		System.out.println("Swapped word: " + swapwrd);
		System.out.println("Sorted word: " + sortwrd);
	}
}