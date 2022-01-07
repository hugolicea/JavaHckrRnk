package solution;

public class Result {
	/*
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * LONG_INTEGER n as parameter.
	 */

	public static long flippingBits(long n) {

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
		return result;
	}
}
