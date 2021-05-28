package chapter_6;

public class Exercise_4 {
	/**
	 * A method that takes three doubles as parameters and returns a * b + c.
	 * 
	 * @param a double
	 * @param b double
	 * @param c double
	 * @return a * b + c
	 */
	public static double multadd(double a, double b, double c) {
		return a * b + c;
	}
	
	/**
	 * A method that takes a double as a parameter and that uses multadd to calculate x * e^-x + sqrt(1 - e^-x)
	 * 
	 * @param x double
	 * @return x * e^-x + sqrt(1 - e^-x)
	 */
	public static double expSum(double x) {
		return multadd(x, Math.pow(Math.E, -x), Math.sqrt(1 - Math.pow(Math.E, -x)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multadd(1.0, 2.0, 3.0));
		System.out.println(multadd(0.5, Math.cos(Math.PI / 4), Math.sin(Math.PI / 4)));
		System.out.println(multadd(1.0, Math.log(10), Math.log(20)));
		System.out.println(expSum(2.0));
	}
}
