package chapter_2;
/**
 * 
 * The point of this exercise is to use some of the arithmetic operators,
 * and to to start thinking about compound entities that are represented with multiple values.
 *
 */
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 14;
		int minute = 0;
		int second = 0;
		
		System.out.print("Number of minutes since midnight: ");
		System.out.println(hour * 3600 + minute * 60 + second);
		System.out.print("Number of seconds remaining in the day: ");
		System.out.println(86400 - (hour * 3600 + minute * 60 + second));
		System.out.print("Percentage of the day that has passed: ");
		System.out.println((((double) hour * 3600.0 + (double) minute * 60 + (double) second) / 86400) * 100);
	}

}
