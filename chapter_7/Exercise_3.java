package chapter_7;

public class Exercise_3 {
	/**
	 * An iterative version of power from Exercise 9 Chapter 6
	 * 
	 * @param x double
	 * @param n integer
	 * @return x^n
	 */
	public static double power(double x, int n) {
		double sum = 1.0;
		while (n != 0) {
			sum = sum * x;
			n -= 1;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(3, 4));
	}

}
