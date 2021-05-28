package chapter_8;

public class Exercise_8 {
	/**
	 * A method that takes an array of integers and two indexes, lowIndex and highIndex, 
	 * and finds the maximum value in the array, but only considering the elements between lowIndex and highIndex,
	 * including both. 
	 * 
	 * @param a integer array
	 * @param lowIndex integer
	 * @param highIndex integer
	 * @return maximum value in a
	 */
	public static int maxInRange(int[] a, int lowIndex, int highIndex) {
		if (lowIndex == highIndex) {
			return a[lowIndex];
		}
		
		int piece1 = a[lowIndex];
		int piece2 = maxInRange(a, lowIndex + 1, highIndex);
		
		if (piece1 > piece2) {
			return piece1;
		} else {
			return piece2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {112, 45, 32, 9999, 72645, 343, 56, 64, 4};
		System.out.println(maxInRange(a, 0, a.length - 1));
	}

}
