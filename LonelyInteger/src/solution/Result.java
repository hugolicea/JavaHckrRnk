package solution;

import java.util.List;

public class Result {

	/*
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int lonelyInteger(List<Integer> a) {

		long startTime = System.nanoTime();

		int unique = 0;

		for (int i = 0; i < a.size(); i++) {
			int numTocompare = a.get(i);
			int count = 0;
			for (int j = 0; j < a.size(); j++) {
				int elementToCompare = a.get(j);
				if (i != j) {
					if (numTocompare == elementToCompare)
						count++;
				}
			}
			if (count == 0) {
				unique = numTocompare;
			}
		}
		System.out.println(System.nanoTime() - startTime);
		return unique;
	}

	public static int lonelyIntegerusingXOR(List<Integer> a) {

		long startTime = System.nanoTime();

		int result = a.get(0);

		for (int i = 1; i < a.size(); i++) {
			result ^= a.get(i);
		}

		System.out.println(System.nanoTime() - startTime);
		return result;
	}
}
