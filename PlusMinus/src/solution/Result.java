package solution;
import java.util.List;

public class Result {

	/*
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */
	public static void plusMinus(List<Integer> arr) {
		int numElements = arr.size();
		int posElements = 0;
		int negElements = 0;
		int zeroo = 0;

		for (int i = 0; i < numElements; i++) {
			if (arr.get(i) > 0)
				posElements++;
			else if (arr.get(i) < 0)
				negElements++;
			else
				zeroo++;

		}

		System.out.printf("%.6f", posElements / numElements);
		System.out.println();
		System.out.printf("%.6f", negElements / numElements);
		System.out.println();
		System.out.printf("%.6f", zeroo / numElements);

	}
}
