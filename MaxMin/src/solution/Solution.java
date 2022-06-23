package solution;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		/*
		 * 7 3 100 200 300 350 400 401 402
		 */ int k = 3;
		List<Integer> arr = Arrays.asList(100, 200, 300, 350, 400, 401, 402);
		System.out.println(Result.maxMin(k, arr));

	}

}
