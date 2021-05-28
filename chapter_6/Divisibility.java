package chapter_6;

public class Divisibility {
	/**
	 * A method that takes two integers, n and m, and that returns true if n is divisible by m,
	 * and false otherwise.
	 * 
	 * @param n integer
	 * @param m integer
	 * @return boolean
	 */
	public static boolean isDivisible(int n, int m) {
		return n % m == 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDivisible(40, 2));
	}

}
