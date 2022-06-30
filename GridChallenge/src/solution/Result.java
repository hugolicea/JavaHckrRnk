package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {

	public static String gridChallenge(List<String> grid) {

		List<String> al = new ArrayList<String>();

		for (int i = 0; i < grid.size(); i++) {
			char charArr[] = grid.get(i).toCharArray();
			Arrays.sort(charArr);
			String s = new String(charArr);
			al.add(s);
		}

		for (int i = 0; i < al.size() - 1; i++) {
			for (int j = 0; j < al.get(i).length(); j++) {
				if (al.get(i).charAt(j) > al.get(i + 1).charAt(j)) {
					return "NO";
				}
			}
		}
		return "YES";
	}
}
