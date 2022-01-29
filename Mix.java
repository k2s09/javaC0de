// Mixing two words character by character

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Mix {
	String wrd;
	int len;

	public Mix() {
		wrd = "";
		len = 0;
	}

	public static void main(String args[]) throws IOException {
		Mix obj1 = new Mix();
		Mix obj2 = new Mix();
		Mix result = new Mix();
		System.out.print("First word: ");
		obj1.feedWord();
		System.out.print("Second word: ");
		obj2.feedWord();
		result.mixWord(obj1, obj2);
		System.out.print("Required word: ");
		result.display();
	}

	public void feedWord() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		wrd = br.readLine();
		wrd = wrd.trim();
		wrd = wrd.toUpperCase();
		if (wrd.indexOf(' ') > 0)
			wrd = wrd.substring(0, wrd.indexOf(' '));
		len = wrd.length();
	}

	public void mixWord(Mix p, Mix q) {
		int i = 0;
		int j = 0;
		while (true) {
			if (i < p.len && j < q.len) {
				this.wrd += p.wrd.charAt(i);
				this.wrd += q.wrd.charAt(j);
			} else
				break;
			i++;
			j++;
		}
		if (i < p.len)
			this.wrd += p.wrd.substring(i);
		if (j < q.len)
			this.wrd += q.wrd.substring(i);
	}

	public void display() {
		System.out.println(wrd);
	}
}
