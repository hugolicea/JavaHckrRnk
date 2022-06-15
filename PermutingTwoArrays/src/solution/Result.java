package solution;

import java.util.Collections;
import java.util.List;

public class Result {

	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
		Collections.sort(A);
		Collections.sort(B);

		int indexA = 0;
		int indexB = B.size() - 1;

		while (indexA < A.size() && indexB >= 0) {
			if (A.get(indexA) + B.get(indexB) < k) {
				return "NO";
			}
			indexA++;
			indexB--;
		}
		return "YES";
	}
	
	 public static String twoArraysOtherSolution(int k, List<Integer> A, List<Integer> B) {
	        Collections.sort(A);
	        Collections.sort(B);
	        Collections.reverse(B);
	        for (int i=0;i<A.size();i++){
	            if (k > A.get(i)+B.get(i)){
	                return "NO";
	            }
	        }
	        return "YES";
	    }
}
