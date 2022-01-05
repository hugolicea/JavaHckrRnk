package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>();
		strings.add("aba");
		strings.add("baba");
		strings.add("aba");
		strings.add("xzxb");
		List<String> queries = new ArrayList<String>();
		queries.add("aba");
		queries.add("xzxb");
		queries.add("ab");

		List<Integer> res = Result.matchingStrings(strings, queries);
		System.out.println(res);
	}
}
