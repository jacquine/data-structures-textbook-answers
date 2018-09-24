public class isMultiple {
	public static boolean isMultiple(long n, long m) {
		if (n % m == 0) 
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isMultiple(128, 3));
	}
}
