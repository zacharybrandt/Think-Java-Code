package chapter_3;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Temperature: ");
		Double c = s.nextDouble();
		Double f = c * (9.0 / 5.0) + 32;
		System.out.printf("%.1f C = %.1f F", c, f);
		
	}

}
