package solution;

public class Solution {

	public static void fizzBuzz(int n) {

		int m = 3;
		int o = 5;

		System.out.println("Math.floorMod(n, m)" + Math.floorMod(n, m));
		System.out.println("Math.floorMod(n, o)" + Math.floorMod(n, o));

		for (int i = 1; i <= n; i++) {
			if ((Math.floorMod(i, m) == 0) && (Math.floorMod(i, o) == 0)) {
				System.out.println("FizzBuzz");
			} else if ((Math.floorMod(i, m)) == 0) {
				System.out.println("Fizz");
			} else if (Math.floorMod(i, o) == 0) {
				System.out.println("Buzz");
			} else if ((Math.floorMod(i, m) != 0) || (Math.floorMod(i, o) != 0)) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		int n = 15;

		fizzBuzz(n);

	}

}
