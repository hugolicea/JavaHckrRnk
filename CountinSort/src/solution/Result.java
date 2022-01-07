package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {

	/*
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 */

	public static List<Integer> countingSort(List<Integer> arr) {

		List<Integer> result = new ArrayList<Integer>();

		int[] frecArray = new int[100];
		Arrays.fill(frecArray, 0);
		for (Integer a : arr) {
			frecArray[a]++;
		}

		for (int i = 0; i < frecArray.length; i++) {
			result.add(frecArray[i]);
		}
		/**
		 * // ***************************************************************
		 * 
		 * List<Integer> aux = new ArrayList<Integer>();
		 * 
		 * for (int i = 0; i < 100; i++) { aux.add(i, 0); }
		 * 
		 * for (Integer a : arr) { System.out.println(a); aux.set(a, aux.get(a) + 1); }
		 **/
		return result;
	}

}