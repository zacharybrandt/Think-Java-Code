package chapter_4;
/**
 * 
 * The purpose of this exercise is to take code from a previous exercise and encapsulate it in a method that takes parameters.
 *
 */
public class Exercise_3 {
	
	public static void printAmerican(String day, int date, String month, int year) {
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}
	
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println(day + " " + date + " " + month + " " + year);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAmerican("Saturday", 22, "July", 2015);
		printEuropean("Saturday", 22, "July", 2015);
	}

}
