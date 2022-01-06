package solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Result {

	public static List<String> keyCombination(Map<Integer, String> map) {

		List<List<String>> listOflist = new ArrayList<>();
		List<String> result = new ArrayList<>();
		listOflist = getStrings(map);
		result = makeCombinations(listOflist);

		return result;
	}

	public static List<List<String>> getStrings(Map<Integer, String> map) {
		Iterator<Integer> iterator = map.keySet().iterator();
		List<List<String>> listOflist = new ArrayList<>();

		while (iterator.hasNext()) {

			Integer mapElement = iterator.next();
			System.out.println("key: " + mapElement + " value: " + map.get(mapElement));

			List<String> subString = new ArrayList<>();
			List<String> arr = new ArrayList<>();
			subString.add(map.get(mapElement));

			for (int j = 0; j < subString.size(); j++) {
				String[] sepChar = subString.get(j).split("");
				for (String character : sepChar) {
					arr.add(character);
				}
			}
			listOflist.add(arr);
		}
		return listOflist;
	}

	public static List<String> makeCombinations(List<List<String>> listOflist) {
		List<String> tempRes = new ArrayList<>();
		for (int i = 0; i < listOflist.size(); i++) {

			if (i < listOflist.size() - 1) {
				List<String> str = new ArrayList<>();
				str = listOflist.get(i + 1);
				if (tempRes.size() == 0) {
					tempRes = getFirstStr(listOflist);
					tempRes = combinate(getFirstStr(listOflist), str);
				} else
					tempRes = combinate(tempRes, str);
			}

		}
		return tempRes;
	}

	public static List<String> combinate(List<String> arr, List<String> arr1) {
		List<String> res = new ArrayList<>();

		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr1.size(); j++) {
				res.add(arr.get(i) + arr1.get(j));
			}
		}
		return res;
	}

	public static List<String> getFirstStr(List<List<String>> listOflist) {
		return listOflist.get(0);
	}

}
