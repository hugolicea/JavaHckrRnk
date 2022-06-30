package solution;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		int n = 2;
		List<List<Integer>> queries = Arrays.asList(
				Arrays.asList(1, 0, 5), 
				Arrays.asList(1, 1, 7),
				Arrays.asList(1, 0, 3), 
				Arrays.asList(2, 1, 0), 
				Arrays.asList(2, 1, 1));

		System.out.println(Result.dynamicArray(n, queries));

	}

}
