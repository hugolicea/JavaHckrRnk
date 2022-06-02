package solucion;

public class Result {

	/*
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String pangrams(String s) {
		String strAux = s.toLowerCase();
		if (s.length() < 26) {
			return "not pangram";
		} else {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (strAux.indexOf(ch) < 0) {
					return "not pangram";
				}
			}

		}
		return "pangram";
	}
	/*
	 * public static String pangrams(String s) { 
	 * boolean res = false; 
	 * char[] arrAux = new char[26]; arrAux = setAlphabet();
	 * 
	 * for (char car : arrAux) { res = false; for (int i = 0; i < s.length(); i++) {
	 * if (car == Character.toLowerCase(s.charAt(i))) { res = true; i = s.length();
	 * } } if (res == false) { return "not pangram"; } } return (res ? "pangram" :
	 * "not pangram"); }
	 * 
	 * public static char[] setAlphabet() { char[] s; s = new char[26]; for (int i =
	 * 0; i < s.length; i++) { s[i] = (char) ('a' + i); } return s; }
	 */
}
