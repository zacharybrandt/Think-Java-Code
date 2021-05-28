package chapter_9;
import java.util.Arrays;

public class Exercise_2 {
	/**
	 * A method that takes a string as a parameter and returns a histogram of the letters in the string.
	 * 
	 * @param s String
	 * @return histogram of the letters in s
	 */
	public static int[] letterHist(String s) {
		int[] counts = new int[26];
		s = s.toLowerCase();
		for (int i = 0; i <= s.length() - 1; i++) {
			char letter = s.charAt(i);
			counts[(letter - 'a' + 1)]++;
		}
		return counts;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(letterHist("hello")));
	}

}
