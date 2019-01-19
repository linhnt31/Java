package Regrex;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Description
//Java Regex Finder Example

public class Practice2 {
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter regex pattern: ");
		Pattern p = Pattern.compile(sc.nextLine());
		System.out.println("Enter String: ");
		Matcher m = p.matcher(sc.nextLine());
		
		boolean found = false;
		while(m.find()) {
			System.out.println("I found the text  "+m.group() + " starting at index "+ m.start()+ " and ending at "+ m.end());
			found  = true;
		}
		if(!found ) {
			System.out.println("No match found");
		}
	}

}
