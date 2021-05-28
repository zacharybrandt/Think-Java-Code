package chapter_3;
import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Seconds: ");
		int input = s.nextInt(); 
		int hours = input / 3600;
		int minutes = (input % 3600) / 60;
		int seconds = ((input % 3600) % 60);
		
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", input, hours, minutes, seconds);
	}

}
