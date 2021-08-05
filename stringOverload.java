public class stringOverload {

	public static void main(String args[]) {
		stringOverload obj = new stringOverload();
		obj.display('a', "lamp");
		obj.display('e');
		obj.display(1, 5, "helloworld");
	}

	void display(char ch, String S) {
		int i = S.indexOf(ch);
		System.out.println(i);
	}

	void display(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println((char) (ch + 1));
		else
			System.out.println((char) (ch - 32)); //
	}

	void display(int n1, int n2, String S) {
		System.out.println(S.substring(n1, (n2 + 1)));
	}
}  
    
    
    
    