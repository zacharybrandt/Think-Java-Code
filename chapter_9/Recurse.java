package chapter_9;

public class Recurse {
	/**
	 * Returns the first character of the given String.
	 */
	public static char first(String s) {
	    return s.charAt(0);
	}
	
	/**
	 * Returns all but the first letter of the given String.
	 */
	public static String rest(String s) {
	    return s.substring(1);
	}
	
	/**
	 * Returns all but the first and last letter of the String.
	 */
	public static String middle(String s) {
	    return s.substring(1, s.length() - 1);
	}
	
	/**
	 * Returns the length of the given String.
	 */
	public static int length(String s) {
	    return s.length();
	}
	
	public static void printString(String s) {
		if (length(s) == 0) {
			System.out.println("");
		} else {
			System.out.println(first(s));
			printString(rest(s));
		}
	}
	
	public static void printBackward(String s) {
		int index = length(s) - 1;
		while (index >= 0) {
			char letter = s.charAt(index);
			System.out.println(letter);
			index--;
		}
	}
	
	public static String reverseString(String s) {
		String reverse = "";
		int length = s.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		return reverse;
	}
	
	public static boolean isPalindrome(String s) {
		if (length(s) == 1) {
			return true;
		} else {
			if (length(s) == 2 && Character.compare(s.charAt(0), s.charAt(1)) == 0) {
				return true;
			} else {
				if (Character.compare(s.charAt(0), s.charAt(length(s) - 1)) == 0) {
					return isPalindrome(middle(s));
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(first("Hello, world!"));
//		System.out.println(rest("Hello, world!"));
//		System.out.println(middle("Hello, world!"));
//		System.out.println(length("Hello, world!"));
		
//		printString("Hello, world!");
//		printBackward("Hello, world!");
//		System.out.println(reverseString("Hello, world!"));
		
		System.out.println(isPalindrome("ottfo"));

	}

}
