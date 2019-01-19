package Regrex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
//		System.out.println("is "+ Alphanumeric(str));
		System.out.println("is Numeric : " + Numeric(str));
		
		sc.close();
	}
	
	/* Question 1: Create a regular expression that accepts alphanumeric characters only.  
	Its length must be six characters long only.*/  
	
	public static boolean Alphanumeric(String s) {
		boolean b = Pattern.matches("[0-9a-zA-Z]{6}", s);
		return b;
	}
	
	/* Question 2 : Create a regular expression that accepts 10 digit numeric characters 
	 starting with 7, 8 or 9 only.*/  
	
	public static boolean Numeric(String s) {
		Pattern p = Pattern.compile("[789]\\d{9}");
		Matcher m = p.matcher(s);
		return m.matches();
//		boolean b = Pattern.matches("[789]{1}\\d{9}", s);
//		return b;
	}

}
