package chapter_8;

public class Exercise_6 {
	
	public static boolean areFactors(int n, int[] a) {
		for (int value : a) {
			if (!(n % value == 0)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 8};
		System.out.println(areFactors(16, a));
	}

}
