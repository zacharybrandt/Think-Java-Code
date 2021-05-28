package chapter_6;

public class Triangle {
	/**
	 * A method that takes three integers as arguments and returns either true or false,
	 * depending on whether you can or cannot form a triangle with the given lengths.
	 * 
	 * @param a integer
	 * @param b integer
	 * @param c integer
	 * @return boolean
	 */
	public static boolean isTriangle(int a, int b, int c) {
		return !(a > b + c) && !(b > a + c) && !(c > a + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isTriangle(20, 1, 2));
	}

}
