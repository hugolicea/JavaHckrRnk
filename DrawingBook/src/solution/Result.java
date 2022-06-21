package solution;

public class Result {

	public static int pageCount(int n, int p) {

		// int a = Math.min(p / 2, n / 2 - p / 2);
		return (p <= (n / 2)) ? (p / 2) : ((n / 2) - (p / 2));

	}

}
