package Regrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class someClassInRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(".s"); //represent a single character
		Matcher m = p.matcher("as");
		
		//1st way
		boolean b = m.matches();
		System.out.println(b);
		
		//2nd way
		boolean b1 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b1);
		
		//3rd way
		boolean b2 = Pattern.matches(".s", "as");
		System.out.println(b2);
		
		System.out.println("-------------");
		
		
		//Test 2
		System.out.println(Pattern.matches(".s", "as"));
		
		System.out.println("----------------");
		
		
		//Test 3:  regex classes
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[^abc]","h"));
		System.out.println("------------");
		
		
		//Test 4: Regex quantifiers
		System.out.println("Regex Quantifiers");
		System.out.println(Pattern.matches("[amn]?", "bc")); //b,c are not matching pattern
		System.out.println(Pattern.matches("[amn]+", "ammmn")); 
		System.out.println(Pattern.matches("[linh]?", ""));
		System.out.println(Pattern.matches("a{2,5}","aaaa7a"));
		
		
		//test 5: Regex metacharacters
		System.out.println("----------------------");
		System.out.println("Regex metacharacters");
		
		System.out.println(Pattern.matches("\\d+", "12356")); //
		System.out.println(Pattern.matches("\\d+", "abcd"));
		System.out.println(Pattern.matches("\\D+", "12356"));
		System.out.println(Pattern.matches("\\D+", "abc111d"));
		System.out.println(Pattern.matches("\\W+", "12356"));
		
		
	}

}
