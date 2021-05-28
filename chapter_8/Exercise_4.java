package chapter_8;

public class Exercise_4 {
	
	public static int indexOfMax(int[] a) {
		int max = a[0];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {30, 25, 1, 3};
		System.out.println((indexOfMax(a)));
	}

}
