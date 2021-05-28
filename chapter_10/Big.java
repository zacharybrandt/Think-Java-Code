package chapter_10;
import java.math.BigInteger;

public class Big {
	
	public static BigInteger factorial(BigInteger n) {
		BigInteger sum = BigInteger.valueOf(1);
		while (n != BigInteger.ZERO) {
			sum = n.multiply(sum);
			n = n.subtract(BigInteger.ONE);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i < 31) {
			System.out.println(factorial(BigInteger.valueOf(i)));
			i++;
		}
	}
}