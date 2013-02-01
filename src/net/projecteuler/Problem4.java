package net.projecteuler;

public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int highest = 0;
		for (int i=999; i >= 100; i--) {
			for (int j=999; j >= 100; j--) {
				int sum = i * j;
				if (isPalindrome(sum)) {
					if (sum > highest) { highest = sum; }
				}
			}
		}
		System.out.println(highest);
	}

	private static boolean isPalindrome(int sum) {
		String sumString = Integer.toString(sum);
		String backwards = new StringBuffer(sumString).reverse().toString();
		return sumString.equals(backwards);
	}

}
