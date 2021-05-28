package chapter_5;
import java.util.Scanner;
/**
 * 
 * The purpose of this exercise is to take a problem and break it into smaller problems,
 * and to solve the smaller problems by writing simple methods.
 *
 */
public class Beer {
	
	public static void lyrics(int b) {
		if (b == 0) {
			System.out.println("No bottles of beer on the wall,");
			System.out.println("no bottles of beer,");
			System.out.println("ya' can't take one down, ya' can't pass it around,");
			System.out.println("'cause there are no more bottles of beer on the wall!");
		} else {

			System.out.print(b);
			System.out.println(" bottles of beer on the wall,");
			System.out.print(b);
			System.out.println(" bottles of beer,");
			System.out.println("ya' take one down, ya' pass it around,");
			System.out.print(b - 1);
			System.out.println(" bottles of beer on the wall.");
			lyrics(b - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bottles: ");
		int beer = s.nextInt();
		
		lyrics(beer);
	}

}
