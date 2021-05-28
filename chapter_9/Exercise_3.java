package chapter_9;
/**
 * 
 * The purpose of this exercise is to review encapsulation and generalization.
 *
 */
public class Exercise_3 {
	
	/**
	 * A method that takes a string argument and returns the final value of count.
	 * 
	 * @param s String
	 * @return integer
	 */
	public static int parenthesesCheck(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
		    char c = s.charAt(i);
		    if (c == '(') {
		        count++;
		    } else if (c == ')') {
		        count--;
		    }
		}

		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(parenthesesCheck("((3 + 7) * 2)"));
	}

}
