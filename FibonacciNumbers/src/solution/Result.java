package solution;

public class Result {

	public static long fibonacci(int fiboNumber) {

		if (fiboNumber <= 1) {
			return fiboNumber;
		}
		if (Solution.fibonacciCache[fiboNumber] != 0) {
			return Solution.fibonacciCache[fiboNumber];
		}

		long nthfibonacciNumber = (fibonacci(fiboNumber - 1) + fibonacci(fiboNumber - 2));

		Solution.fibonacciCache[fiboNumber] = nthfibonacciNumber;

		return nthfibonacciNumber;
	}

}
