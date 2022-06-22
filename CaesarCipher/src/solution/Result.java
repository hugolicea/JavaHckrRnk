package solution;

public class Result {

	public static String caesarCipher(String s, int k) {
		String result = "";
		k = k % 26;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!Character.isAlphabetic(c)) {
				result += c;
			} else if (Character.toLowerCase(c) + k > 'z') {
				result += (char) ((c + k) - 26);
			} else {
				result += (char) (c + k);
			}
		}

		return result;
	}
}
