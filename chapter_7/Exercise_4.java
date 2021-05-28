package chapter_7;

public class Exercise_4 {
	
	public static int factorial(int n) {
		int sum = 1;
		while (n != 0) {
			sum = sum * n;
			n -= 1;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

}
