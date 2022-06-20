package solution;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int n = 9;
		List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);

		System.out.println(Result.sockMerchant(n, ar));
		System.out.println(Result.sockMerchantNew(n, ar));

	}

}
