package solution;

public class Solution {
	static long[] fibonacciCache;

	public static void main(String[] args) {

		int fiboNumber = 91;

		fibonacciCache = new long[fiboNumber + 1];

		System.out.println(Result.fibonacci(fiboNumber));
	}

}
