package chapter_11;

public class Rational {
	
	private int numerator;
	private int denominator;
	
	public Rational() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public String toString() {
		String s = this.numerator + "/" + this.denominator;
		return s;
	}
	
	public void printRational() {
		System.out.println(this.numerator + "/" + this.denominator);
	}
	
	public void negate() {
		this.numerator = this.numerator * -1;
	}
	
	public void invert() {
		int a = this.numerator;
		int b = this.denominator;
		this.numerator = b;
		this.denominator = a;
	}
	
	public double toDouble() {
		return ((double)this.numerator / this.denominator);
	}
	
	public static int gcd(int a, int b) {
	    return b == 0 ? a : gcd(b, a % b);
	}
	
	public void reduce() {
		int gcd = gcd(this.numerator, this.denominator);
		this.numerator = this.numerator / gcd;
		this.denominator = this.denominator / gcd;
	}
	
	public Rational add(Rational that) {
		int numerator = (this.numerator * that.denominator) + (that.numerator * this.denominator);
		int denominator = this.denominator * that.denominator;
		Rational sum = new Rational(numerator, denominator);
		sum.reduce();
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational rational = new Rational();
		rational.numerator = 2;
		rational.denominator = 4;
		
		System.out.println(rational.toDouble());
	
		
//		Rational rat = new Rational(1, 4);
//		
//		System.out.println(rational.add(rat));
//		rat.invert();
//		System.out.println(rat);
		
	}
}