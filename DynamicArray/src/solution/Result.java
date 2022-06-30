package solution;

import java.util.ArrayList;
import java.util.List;

public class Result {

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		List<Integer> result = new ArrayList<Integer>();
		int lastAnswer = 0;

		for (int i = 0; i < n; i++) {
			arr.add(new ArrayList<Integer>());
		}

		for (List<Integer> q : queries) {
			int index = (q.get(1) ^ lastAnswer) % n;
			int x = q.get(0);
			int y = q.get(2);

			if (x == 1) {
				arr.get(index).add(y);
			} else if (x == 2) {
				int size = arr.get(index).size();
				lastAnswer = arr.get(index).get(y % size);
				result.add(lastAnswer);
			}
		}

		return result;
	}

}
