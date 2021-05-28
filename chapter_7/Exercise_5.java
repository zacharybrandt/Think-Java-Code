package chapter_7;

public class Exercise_5 {
	
	/**
	 * A recursive method that computes the factorial function
	 * 
	 * @param n integer
	 * @return factorial of n
	 */
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int recurse = factorial(n - 1);
		int result = n * recurse;
		return result;
	}
	
	/**
	 * A method that estimates e^x by adding the first n terms of the series
	 * 
	 * @param x integer parameter
	 * @param n integer parameter
	 * @return first n terms of e^x series
	 */
	public static double myexp(double x, int n) {
		double sum = 1;
		double term = 1;
		for (int i = 1; i <= n; i++) {
			term = (term * x) / i; 
			sum += term;
		}
		return sum;
	}
	
	public static String check(double x) {
		String s = x + "\t" + myexp(x, 10) + "\t" + Math.exp(x);
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.1;
		while (x < 1000.0 ) {
			System.out.println(check(x));
			x = x * 10;
			
		}
		x = -0.1;
		while (x > -1000.0 ) {
			System.out.println(check(x));
			x = x * 10;
		}
		
	}

}
