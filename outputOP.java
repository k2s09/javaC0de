public class outputOP {
	public static void main(String args[]) {
		int a = 5, b = 6;
		char ch = 'A';
		System.out.println(a + b + " is output");
		System.out.println((a + b) + " is output");
		System.out.println("output is " + a + b);
		System.out.println("output is " + (a + b));
		System.out.println(a + b + ch + " is output");
		System.out.println((a + b + ch) + " is output");
		System.out.println(ch + a + b + " is output");
		System.out.println((ch + a + b) + " is output");
		System.out.println("output is " + a + b + ch);
		System.out.println("output is " + ch + a + b);
		System.out.println("output is " + (a + b + ch));
		System.out.println("output is " + (ch + a + b));
		String h = "hello world";
		System.out.println(h.endsWith("d"));
	}
}