package chapter_3;
import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Guess: ");
		int guess = s.nextInt();
		System.out.print("Your guess: ");
		System.out.println(guess);
		
		Random random = new Random();  
		int number = random.nextInt(100) + 1;
		System.out.println(number);
		
		System.out.print("The difference: ");
		System.out.println(Math.abs(guess - number));
	}

}
