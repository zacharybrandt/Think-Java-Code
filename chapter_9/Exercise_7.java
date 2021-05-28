package chapter_9;
import java.util.Arrays;

public class Exercise_7 {
	
	public static int[] letterHist(String s) {
		int[] counts = new int[26];
		s = s.toLowerCase();
		for (int i = 0; i <= s.length() - 1; i++) {
			char letter = s.charAt(i);
			counts[(letter - 'a' + 1)]++;
		}
		return counts;
	}
	
	public static boolean areAnagrams(String s1, String s2) {
		int[] a = letterHist(s1);
		int[] b = letterHist(s2);
		
		if (Arrays.equals(a, b)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areAnagrams("stop", "pots"));
	}

}
