package chapter_9;

public class Exercise_3 {
	
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
