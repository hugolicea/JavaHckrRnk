package solution;

import java.util.Collections;
import java.util.List;

public class Result {

	/*
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void miniMaxSum(List<Integer> arr) {
		long sum = 0;
		long minSum = 0;
		long maxSum = 0;
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}

		minSum = sum - arr.get(arr.size() - 1);
		maxSum = sum - arr.get(0);
		System.out.println(minSum + " " + maxSum);
	}

}
