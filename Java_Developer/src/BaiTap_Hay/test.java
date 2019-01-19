package BaiTap_Hay;

import java.awt.List;
import java.util.*;
import java.util.ArrayList;

public class test {
	// Description
	/*
	 * Given array of integers, for each position i, search among the previous
	 * positions for the last (from the left) position that contains a smaller
	 * value. Store this value at position i in the answer. If no such value can be
	 * found, store -1 instead.
	 * 
	 * Example
	 * 
	 * For items = [3, 5, 2, 4, 5], the output should be arrayPreviousLess(items) =
	 * [-1, 3, -1, 2, 4].
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> arr  =new ArrayList<Integer>();
//		int[] result = test(arr);
//		printValue(result);

		int x = 10;
		System.out.println(String.valueOf(x));
		System.out.println(x + 5);
	}

	public static String lineEncoding(String s) {
		StringBuilder sb = new StringBuilder();
		char prev = s.charAt(0);
		int freq = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != prev) {
				if (freq == 1) {
					sb.append(prev);
				} else {
					sb.append(freq + "" + prev);
				}
				freq = 1;
				prev = s.charAt(i);
			} else {
				freq++;
			}
		}
		int i = s.length() - 1;
		if (freq == 1) {
			sb.append(prev);
		} else {
			sb.append(freq + "" + prev);
		}

		return sb.toString();
	}

}
