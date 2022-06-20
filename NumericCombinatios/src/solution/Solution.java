package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		List<String> result = new ArrayList<>();

		//map.put(1, "_,@");
		map.put(2, "ABC");
		map.put(3, "DEF");
		map.put(4, "GHI");
		map.put(5, "JKL");
		map.put(6, "MNO");
		map.put(7, "PQR");
		map.put(8, "STU");
		map.put(9, "VWX");

		result = Result.keyCombination(map);
		System.out.println("Possible combinations:" + result.size());
		System.out.println("Combinations:" + result);
	}
}
