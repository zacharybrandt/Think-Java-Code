package chapter_7;

public class Exercise_6 {
	
	public static double gauss(double x, int n) {
		double sum = 1;
		double term = 1;
		for (int i = 1; i < n; i++) {
			term = (term * -1 * x * x) / i;
			sum += term;
		}
		return sum;
	}
	
	public static double check(double x) {
		return (Math.exp(-(x*x)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.0;
		System.out.println(gauss(x, 1000));
		System.out.println(check(x));
	}

}
