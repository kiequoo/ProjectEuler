package net.projecteuler;

public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long test = 600851475143L;
		//long test = 13195L;
		
		for (int i=2; i < Math.sqrt(test); i++) {
			if ((test % i == 0) && isPrime(i)) {
				System.out.println("Prime Factor: " + i);
			}
		}
		
	}
	
	public static boolean isPrime(long n) {
		for (int i=2; i < n/2; i++) {
			if (n % i == 0) { return false; }
		}
		return true;
	}

}
