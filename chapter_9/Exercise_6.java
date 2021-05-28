package chapter_9;

public class Exercise_6 {
	
	public static int[] letterHist(String s) {
		int[] counts = new int[26];
		s = s.toLowerCase();
		for (int i = 0; i <= s.length() - 1; i++) {
			char letter = s.charAt(i);
			counts[(letter - 'a' + 1)]++;
		}
		return counts;
	}
	
	public static boolean isDoubloon(String s) {
		int[] a = letterHist(s);
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != 2 && a[i] != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDoubloon("Abba"));
	}

}
