package net.projecteuler;

public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 20;
		boolean found = false;
		while (!found) {
			boolean divisible = true;
			for (int i=1; i <=20; i++) {
				if (count % i > 0) {
					divisible = false;
				}
			}
			if (divisible) {
				found = true;
				System.out.println(count);
			}
			count = count + 20;
		}

	}

}
