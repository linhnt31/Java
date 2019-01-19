package BaiTap_Hay;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_codeSignal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "abc";
		String word2 = "cbb";
		
		int[] x = new int[26];
		int[] y = new int[26];
		
		for(int i = 0 ; i < word1.length();i++) {
			x[word1.charAt(i)-'a'] += 1;
		}
		for(int i = 0 ; i < word1.length();i++) {
			y[word2.charAt(i)-'a'] += 1;
		}
		
		for(int i = 0 ; i < 26;i++) {
			if(x[i] != y[i]) {
				System.out.println("Error");
				break;
			}
		}
	}
	

}
