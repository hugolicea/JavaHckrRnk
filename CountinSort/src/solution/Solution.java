package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<Integer>() {
			{
				add(74);
				add(18);
				add(60);
				add(61);
				add(35);
				add(83);
				add(13);
				add(56);
				add(75);
				add(52);
				add(70);
				add(12);
				add(24);
				add(37);
				add(17);
				add(0);
				add(16);
				add(64);
				add(34);
				add(81);
				add(82);
				add(24);
				add(69);
				add(2);
				add(30);
				add(61);
				add(83);
				add(37);
				add(97);
				add(16);
				add(70);
				add(53);
				add(0);
				add(61);
				add(12);
				add(17);
				add(97);
				add(67);
				add(33);
				add(30);
				add(49);
				add(70);
				add(11);
				add(40);
				add(67);
				add(94);
				add(84);
				add(60);
				add(35);
				add(58);
				add(19);
				add(81);
				add(16);
				add(14);
				add(68);
				add(46);
				add(42);
				add(81);
				add(75);
				add(87);
				add(13);
				add(84);
				add(33);
				add(34);
				add(14);
				add(96);
				add(7);
				add(59);
				add(17);
				add(98);
				add(79);
				add(47);
				add(71);
				add(75);
				add(8);
				add(27);
				add(73);
				add(66);
				add(64);
				add(12);
				add(29);
				add(35);
				add(80);
				add(78);
				add(80);
				add(6);
				add(5);
				add(24);
				add(49);
				add(82);
			}
		};

		List<Integer> result = Result.countingSort(arr);

		System.out.println(result);

	}

}
