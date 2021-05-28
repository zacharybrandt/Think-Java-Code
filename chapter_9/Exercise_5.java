package chapter_9;

public class Exercise_5 {
	/**
	 * A method that takes a String and returns a boolean indicating whether the word is abecedarian.
	 * 
	 * @param s string
	 * @return boolean
	 */
	public static boolean isAbecedarian(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) > s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAbecedarian("Abdest"));
	}

}
