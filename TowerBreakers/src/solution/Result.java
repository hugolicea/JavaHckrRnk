package solution;

public class Result {

	public static int towerBreakers(int n, int m) {
		return (m == 1 || n % 2 == 0) ? 2 : 1;
	}
}
