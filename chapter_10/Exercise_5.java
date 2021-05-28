package chapter_10;
import java.math.BigInteger;

public class Exercise_5 {
	
	public static BigInteger pow(int x, int n) {
	    BigInteger a = BigInteger.valueOf(x);
	    BigInteger b = BigInteger.valueOf(n);
		
		if (b == BigInteger.ZERO) return BigInteger.ONE;

	    // find x to the n/2 recursively
	    BigInteger t = pow(a.intValue(), b.divide(BigInteger.TWO).intValue());

	    // if n is even, the result is t squared
	    // if n is odd, the result is t squared times x
	    if (b.mod(BigInteger.TWO) == BigInteger.ZERO) {
	        return t.multiply(t);
	    } else {
	        return t.multiply(t).multiply(a);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(16, 17));
	}
}