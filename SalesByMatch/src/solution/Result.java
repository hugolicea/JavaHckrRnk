package solution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Result {

	public static int sockMerchant(int n, List<Integer> ar) {
		int result = 0;
		HashMap<Integer, Integer> pairs = new HashMap<>();
		int count = 0;

		// Iterated Manually.
		for (int i = 0; i < ar.size(); i++) {
			if (pairs.containsKey(ar.get(i))) {
				count = pairs.get(ar.get(i));
				pairs.replace(ar.get(i), ++count);
			} else {
				count = 0;
				pairs.put(ar.get(i), ++count);
			}
		}

		Iterator<Integer> iterator = pairs.keySet().iterator();
		while (iterator.hasNext()) {
			Integer keyValue = (Integer) iterator.next();
			result += pairs.get(keyValue) / 2;
		}

		return result;
	}

	public static int sockMerchantNew(int n, List<Integer> ar) {
		Map<Integer, Integer> colours = new HashMap<Integer, Integer>();
		// By stream
		ar.stream().forEach(element -> colours.put(element, (colours.getOrDefault(element, 0) + 1)));
		int pairs = 0;
		for (Integer key : colours.keySet()) {
			pairs += colours.getOrDefault(key, 0) / 2;
		}
		return pairs;
	}

}
