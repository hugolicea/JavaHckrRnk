package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(3);
		a.add(2);
		a.add(1);

		int result = Result.lonelyinteger(a);
		System.out.println(result);

	}

}
