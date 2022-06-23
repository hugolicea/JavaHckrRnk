package solution;

import java.util.Collections;
import java.util.List;

public class Result {

	public static int maxMin(int k, List<Integer> arr) {
		// Write your code here

		Collections.sort(arr);
		int result = arr.get(arr.size() - 1);

		for (int i = 0; i <= arr.size() - k; i++) {
			int num = arr.get(i + k - 1) - arr.get(i);
			if (num < result) {
				result = num;
			}
		}
		return result;
	}

}
