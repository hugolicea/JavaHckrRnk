package solution;

import java.util.ArrayList;
import java.util.List;

public class Result {
	/*
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. STRING_ARRAY strings 2. STRING_ARRAY queries
	 */

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < queries.size(); i++) {
			String qryToCompare = queries.get(i);
			int count = 0;
			for (int j = 0; j < strings.size(); j++) {
				if (qryToCompare.equals(strings.get(j))) {
					count++;
				}
			}
			result.add(count);
		}
		return result;
	}
}