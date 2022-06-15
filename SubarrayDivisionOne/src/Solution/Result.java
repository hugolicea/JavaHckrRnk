package Solution;

import java.util.List;

public class Result {

	public static int birthday(List<Integer> s, int d, int m) {
		int counter = 0;

		for (int i = 0; i <= s.size() - m; i++) {
			int acum = 0;
			for (int j = i; j < i + m; j++) {
				acum += s.get(j);

			}
			if (acum == d) {
				counter++;
			}

		}

		return counter;
	}

}
