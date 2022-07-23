public class isc2023 {
	public static void main(String[] args) {
		isc2023 o = new isc2023();
		System.out.println(o.quiz(36922));
	}
	int quiz( int n)
	{ 
		if ( n <= 1 )
			return n;
		else
			return (--n % 2) + quiz(n/10);
	}
}
