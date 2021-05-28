package chapter_8;
import java.util.Arrays;
import java.util.Random;

public class Traversal {
	
	/**
	 * A method that takes a double array, and returns a new array that contains the elements squared.
	 * 
	 * @param a double array
	 * @param b power to be raised by
	 * @return a new array with the elements squared
	 */
	public static double[] powArray(double[] a, int b) {
	    for (int i = 0; i < a.length; i++) {
	        a[i] = Math.pow(a[i], b);
	    }
	    return a;
	}
	
	public static int[] randomArray(int size) {
	    Random random = new Random();
	    int[] a = new int[size];
	    for (int i = 0; i < a.length; i++) {
	        a[i] = random.nextInt(100);
	    }
	    return a;
	}
	
	/**
	 * A method that takes an int array of scores from 0 to 100, and returns a histogram of 100 counters.
	 * 
	 * @param scores integer array
	 * @param counters number of counters
	 * @return a histogram of 100 counters
	 */
	public static int[] histogram(int[] scores, int counters) {
		int[] counts = new int[counters];
		for (int score : scores) {
			counts[score]++;
		}
		return counts;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = {1.0, 2.0, 3.0, 4.0};
 		System.out.println(Arrays.toString(powArray(a, 2)));
 		
 		int[] array = randomArray(100); 
 		System.out.println(Arrays.toString(histogram(array, 100)));
 		
	}

}
