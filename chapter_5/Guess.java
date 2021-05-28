package chapter_5;
import java.util.Random;
import java.util.Scanner;

public class Guess {
	
	public static void checkDiff(int answer) {
		Scanner s = new Scanner(System.in);
		System.out.print("Your guess: ");
		int guess = s.nextInt();
		
		if (guess == answer) {
			System.out.println("You got it right!");
		} else {
			if (guess > answer) {
				System.out.println("Too high!");
				checkDiff(answer);
			}
			if (guess < answer) {
				System.out.println("Too low!");
				checkDiff(answer);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();  
		int number = random.nextInt(100) + 1;
		checkDiff(number);
		
	}

}
