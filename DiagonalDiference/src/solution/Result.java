package solution;

import java.util.List;

public class Result {
	/*
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int diagonalDifference(List<List<Integer>> arr) {
		int firstDiagonal = 0;
		int secondDiagonal = 0;

		for (int i = 0; i < arr.size(); i++) {
			firstDiagonal += arr.get(i).get(i);
			secondDiagonal += arr.get(i).get(arr.size() - (i + 1));
		}
		/*
		 * for (int i = 0; i < arr.size(); i++) { secondDiagonal +=
		 * arr.get(i).get(arr.size() - (i + 1)); }
		 */

		return Math.abs(firstDiagonal - secondDiagonal);

	}

}
