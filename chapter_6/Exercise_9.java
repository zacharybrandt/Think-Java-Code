package chapter_6;

public class Exercise_9 {
	/**
	 * A recursive method
	 * 
	 * @param x double
	 * @param n double
	 * @return x^n
	 */
	public static double power(double x, int n) {
		if (n == 0) {
			return 1;
		}
		return(x * power(x, n - 1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(3, 2));
	}

}
