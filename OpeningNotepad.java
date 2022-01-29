import java.io.IOException;

class OpeningNotepad {
	public static void main(String args[]) {
		Runtime rs = Runtime.getRuntime();
		try {
			rs.exec("notepad");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
