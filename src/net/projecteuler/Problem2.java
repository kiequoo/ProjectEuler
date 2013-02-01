package net.projecteuler;

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long firstNumber = 1;
		long secondNumber = 2;
		
		long sum = 2;
		
		while (secondNumber < 4000000) {
			long newNumber = firstNumber + secondNumber;
			
			if (newNumber % 2 == 0) {
				sum = sum + newNumber;
			}
			
			firstNumber = secondNumber;
			secondNumber = newNumber;
		}
		
		System.out.println(sum);
		
	}

}
