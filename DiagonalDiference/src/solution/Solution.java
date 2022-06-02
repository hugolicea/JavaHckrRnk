package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 9;
		Random rand = new Random();
		List<List<Integer>> lists = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			List<Integer> element = new ArrayList<>(m);
			for (int j = 0; j < m; j++) {
				int int_random = rand.nextInt(n);
				element.add(int_random);
			}
			lists.add(element);
			
		}
		System.out.println(lists);
		/*
		 * List<List<Integer>> lists = Arrays.asList( Arrays.asList(11, 2, 4),
		 * Arrays.asList(4, 5, 6), Arrays.asList(10, 8, 12));
		 */
		System.out.println(Result.diagonalDifference(lists));

	}

}
