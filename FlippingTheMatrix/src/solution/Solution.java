package solution;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		List<List<Integer>> matrix = Arrays.asList(Arrays.asList(112, 42, 83, 19), Arrays.asList(56, 125, 56, 49),
				Arrays.asList(15, 78, 101, 43), Arrays.asList(62, 98, 114, 108));
		System.out.println(flippingMatrix(matrix));

	}

	public static int flippingMatrix(List<List<Integer>> matrix) {

		int R = matrix.size();
		int C = matrix.size();
		int sum = 0;

		for (int i = 0; i < R / 2; i++) {
			for (int j = 0; j < C / 2; j++) {

				int r1 = i;
				int c1 = j;
				int r2 = R - i - 1;
				int c2 = C - j - 1;

				sum += Math.max(Math.max(matrix.get(r1).get(c1), matrix.get(r1).get(c2)),
						Math.max(matrix.get(r2).get(c1), matrix.get(r2).get(c2)));
			}
		}
		return sum;
	}
}
