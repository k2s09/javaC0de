public class doesItWork {
	public static void main(String args[]) {
		String s1 = "General Kenobi";
		String s2 = "Master Yoda";
		StringBuffer sb1 = new StringBuffer("Count Dooku");
		StringBuffer sb2 = new StringBuffer("General Grievous");
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.compareTo(sb2));
		System.out.println(s1.equals(sb2));
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.setCharAt(2, 'U');
		System.out.println(sb1.deleteCharAt(4));
	}
}