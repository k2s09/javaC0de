class Practise {
	public static void main(String args[]) {
		int x = 10, y = 80;
		int ch = 'a';
		System.out.println("The result is " + x + y);
		System.out.println("The result is " + (x + y));
		System.out.println("The result is " + ch + x + y);
		System.out.println("The result is " + (ch + x) + y);
		System.out.println("The result is " + ch + (x + y));
		System.out.println("The result is " + (ch + x + y));
		System.out.println(ch + x + y + " is the result");
		System.out.println((ch + x + y) + " is the result");
		System.out.println(x + y + " is the result");
		System.out.println(ch + x++);
		System.out.println(x);
	}
}