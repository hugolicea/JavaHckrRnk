package solution;

public class Result {
	/*
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * LONG_INTEGER n as parameter.
	 */

	public static long flippingBits(long n) {
		long startTime = System.nanoTime();

		String pattern = "00000000000000000000000000000000";

		String bin = Long.toBinaryString(n);
		String aux = pattern.substring(bin.length()) + bin;
		String flipBin = "";

		for (int i = 0; i < aux.length(); i++) {
			if (aux.charAt(i) == '0') {
				flipBin += '1';
			} else
				flipBin += '0';
		}
		long result = Long.parseLong(flipBin, 2);

		System.out.println("Using bucles: " + (System.nanoTime() - startTime));
		return result;
	}

	public static long flippongBitsUsingBitwiseNOTOperator(long n) {

		long startTime = System.nanoTime();

		long result = (long) (Math.pow(2, 32) + ~n);

		System.out.println("NOTOperator: " + (System.nanoTime() - startTime));
		return result;

	}

}
