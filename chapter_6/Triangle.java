package chapter_6;

public class Triangle {
	
	public static boolean isTriangle(int a, int b, int c) {
		return !(a > b + c) && !(b > a + c) && !(c > a + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isTriangle(20, 1, 2));
	}

}
