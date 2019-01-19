package BaiTap_Hay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Upper_Lower_String {
	//Description
/*	Given an initial string, switch case of the minimal possible number of letters to make the whole string written in the upper case or in the lower case.

	Example

	For inputString = "Aba", the output should be
	caseUnification(inputString) = "aba";
	For inputString = "ABa", the output should be
	caseUnification(inputString) = "ABA".
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Key
	String caseUnification(String inputString) {
		  Matcher matcherForUppercase = Pattern.compile("[a-z]").matcher(inputString);
		  Matcher matcherForLowercase = Pattern.compile("[A-Z]").matcher(inputString);

		  int changesToMakeUppercase = 0;
		  while (matcherForUppercase.find()) {
		    changesToMakeUppercase++;
		  }
		  int changesToMakeLowercase = 0;
		  while (matcherForLowercase.find()) {
		    changesToMakeLowercase++;
		  }
		  if (changesToMakeUppercase == 0
		    || changesToMakeLowercase != 0
		    && changesToMakeUppercase < changesToMakeLowercase) {
		    return inputString.toUpperCase();
		  } else {
		    return inputString.toLowerCase();
		  }
		}


}
