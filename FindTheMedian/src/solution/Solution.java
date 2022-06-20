package solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(0, 3, 2, 5, 8, 9, 4, 7, 1, 6, 10);

		System.out.println(findMedian(arr));

	}

	public static int findMedian(List<Integer> arr) {

		Collections.sort(arr);
		int midIndex = arr.size() / 2;
		int resutl = arr.get(midIndex);
		return resutl;
	}
}
