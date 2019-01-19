package Regrex;

import java.util.Scanner;

public class swapAdjacentWords {
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Before swap: "+ str);
		System.out.println("After swap: "+ swapAjacentWords(str));

	}
	
	public static String swapAjacentWords(String s) {
		return s.replaceAll("(\\S+)\\s(\\S+)\\s(\\S+)", "$3 $2 $1");
	}

}
