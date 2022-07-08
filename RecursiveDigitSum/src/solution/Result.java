package solution;

public class Result {

	public static int superDigit(String n, int k) {
		System.out.println(n.chars().toString());
		System.out.println(n.chars().mapToLong(Character::getNumericValue).sum() * k);
		n = n.chars().mapToLong(Character::getNumericValue).sum() * k + "";

		return (n.length() > 1) ? superDigit(n, 1) : Character.getNumericValue(n.charAt(0));

	}

	/*
	 * public static int superDigit(String n, int k) { int digit = 0; for (int i =
	 * 0; i < n.length(); i++) { digit = digit + Integer.valueOf(n.charAt(i) - 48);
	 * } digit = function(digit * k);
	 * 
	 * return function(digit); }
	 * 
	 * public static int function(int digit) {
	 * 
	 * if (digit < 10) { return digit; } else { int num = 0; while (digit > 0) { num
	 * += digit % 10; digit = digit / 10; } return function(num); }
	 * 
	 * }
	 */

}
