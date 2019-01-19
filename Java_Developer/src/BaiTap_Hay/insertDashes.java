package BaiTap_Hay;

public class insertDashes {
	//Description
/*	Transform a given sentence into a new one with dashes between each two consecutive letters.

	Example

	For inputString = "aba caba", the output should be
	insertDashes(inputString) = "a-b-a c-a-b-a".
*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//cach 1 :  by me
	String insertDashes(String inputString) {
	    StringBuilder s = new StringBuilder();
	   
	    if(inputString.length() <= 1) return inputString;
	    s.append(inputString.charAt(0));
	    for(int i = 0 ; i  < inputString.length()-1;i++){
	        char x = inputString.charAt(i);
	        char y = inputString.charAt(i+1);
	        if(Character.isLetter(x) && Character.isLetter(y)){
	            s.append('-');
	            s.append(y);
	        }
	        else {
	            s.append(y);
	        }
	    }
	    return s.toString();
	}


}
