package solution;

import java.util.List;

public class Result {

	/*
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int lonelyinteger(List<Integer> a) {
		int unique = 0;
		int numElements = a.size();

		for (int i = 0; i < numElements; i++) {
			int numTocompare = a.get(i);
			int count = 0;
			for (int j = 0; j < numElements; j++) {
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
		return unique;
	}
}
