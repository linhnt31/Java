package Contest;

import java.util.Scanner;

public class problemB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//amount of input
		int inp = new Scanner(System.in).nextInt();
		
		//test
		while(inp >= 0) {
			int a = new Scanner(System.in).nextInt();
			if(daucuoi(a)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	public static boolean daucuoi(int n) {
		int t = n % 10;
		while(n > 10) {
			n/=10;
		}
		return (n == t);
	}
}
