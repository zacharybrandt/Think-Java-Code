package chapter_6;

public class Exercise_7 {
	
	public static int oddSum(int n) {
		if (n == 1) {
			return 1;
		}
		return(n + oddSum(n - 2));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oddSum(9));
	}

}
