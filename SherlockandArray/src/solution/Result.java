package solution;

import java.util.List;

public class Result {

	public static String balancedSums(List<Integer> arr) {
		// sum=
		// 2x=sum-y

		/*
		 * int indexN = 0; for (Integer integer : arr) { int leftSum = 0; int rightSum =
		 * 0; for (int i = 0; i < arr.size(); i++) {
		 * 
		 * if (indexN > i) { leftSum += arr.get(i); } else if (indexN < i) { rightSum +=
		 * arr.get(i); } } if (leftSum == rightSum) { return "YES"; } indexN++; }
		 */

		int x = 0;
		int sum = 0;

		for (int element : arr) {
			sum += element;
		}

		for (int y : arr) {
			if (2 * x == sum - y) {
				return "YES";
			}
			x += y;
		}

		return "NO";
	}

}
