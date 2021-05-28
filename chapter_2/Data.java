package chapter_2;
/**
 * 
 * The point of this exercise is to use string concatenation to display values with different types,
 * and to practice developing programs gradually by adding a few statements at a time.
 *
 */
public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Thursday";
		int date = 16;
		String month = "July";
		int year = 2015;
		
		System.out.println("American format: ");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("European format: ");
		System.out.println(day + " " + date + " " + month + " " + year);
	}

}
