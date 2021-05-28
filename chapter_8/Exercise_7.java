package chapter_8;

public class Exercise_7 {
	
	public static int indexOfMax(int[] a) {
		int max = a[0];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				index = i;
			}
		}
		return index;
	}
	
	public static boolean[] sieve(int n) {
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			prime[i] = true;
		}
		prime[0] = false;
		prime[1] = false;
		
		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int i = p * p; i <= n; i += p) {
					prime[i] = false;
				}
			}
		}
		
		return prime;
	}
	
	
	public static boolean arePrimeFactors(int n, int[] a) {
		System.out.println(indexOfMax(a));
		int max = a[indexOfMax(a)];
		boolean[] s = sieve(max);
		int product = 1;
		for (int i = 0; i < a.length; i++) {
			if (!(s[a[i]])) {
				return false;
			}
			product = product * a[i];
		}
		return product == n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2};
		System.out.println(arePrimeFactors(2, a));
	}

}
