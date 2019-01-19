package BaiTap_Hay;

import java.util.ArrayList;

//Description
/*A masked number is a string that consists of digits and one asterisk (*) that should be replaced by exactly one digit. Given a masked number find all the possible options to replace the asterisk with a digit to produce an integer divisible by 6.

Example

For inputString = "1*0", the output should be
isDivisibleBy6(inputString) = ["120", "150", "180"].
*/
public class isDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//key
	String[] isDivisibleBy6(String inputString) {

		  int digitSum = 0;
		  char leftBound = '0',
		      rightBound =  '9' ;
		  ArrayList<String> answer = new ArrayList<>();
		  char[] mask = inputString.toCharArray();
		  int asteriskPos = -1;

		  for (int i = 0; i < mask.length; i++) {
		    if (leftBound <= mask[i] &&
		        mask[i] <= rightBound) {
		      digitSum += mask[i] - leftBound;
		    }
		    else {
		      asteriskPos = i;
		    }
		  }

		  for (int i = 0; i < 10; i++) {
		    if ((digitSum + i) % 3 == 0) {
		      mask[asteriskPos] = (char) (leftBound + i);
		      if ((mask[mask.length - 1] - leftBound) % 2 == 0) {
		        answer.add(String.valueOf(mask));
		      }
		    }
		  }

		  return answer.toArray(new String[0]);
		}


}
