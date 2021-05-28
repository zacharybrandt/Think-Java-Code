package chapter_7;

public class Root {
	
	public static double squareRoot(double a) {
		double b = a / 2;
		double c = 0;
		while (Math.abs(b - c) > 0.0001) {
			c = b;
			b = (c + a / c) / 2;
		}
		return b;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(19));
	}

}
