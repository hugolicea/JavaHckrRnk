package solution;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<List<Integer>> matrix = Arrays.asList(Arrays.asList(112, 42, 83, 119), Arrays.asList(56, 125, 56, 49),
				Arrays.asList(15, 78, 101, 43), Arrays.asList(62, 98, 114, 108));

		// int mat[][] = { { 112, 42, 83, 119 }, { 56, 125, 56, 49 }, { 15, 78, 101, 43
		// }, { 62, 98, 114, 108 } };

		System.out.println(printIndex(matrix));

	}

	/*
	 * static int maxSum(int mat[][]) {
	 * 
	 * int R = 4; int C = 4; int sum = 0;
	 * 
	 * for (int i = 0; i < R / 2; i++) { for (int j = 0; j < C / 2; j++) { int r1 =
	 * i; int r2 = R - i - 1; int c1 = j; int c2 = C - j - 1;
	 * 
	 * sum += Math.max(Math.max(mat[r1][c1], mat[r1][c2]), Math.max(mat[r2][c1],
	 * mat[r2][c2])); } }
	 * 
	 * return sum; }
	 */
	public static int printIndex(List<List<Integer>> arr) {
		int R = arr.size();
		int C = arr.size();
		int sum = 0;

		for (int i = 0; i < R / 2; i++) {
			for (int j = 0; j < C / 2; j++) {

				int r1 = i;
				int c1 = j;
				int r2 = R - i - 1;
				int c2 = C - j - 1;

				sum += Math.max(Math.max(arr.get(r1).get(c1), arr.get(r1).get(c2)),
						Math.max(arr.get(r2).get(c1), arr.get(r2).get(c2)));

			}
		}
		return sum;
	}

}
