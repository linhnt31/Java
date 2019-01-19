package BaiTap_Hay;
//Description

/*Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[B.length - 1]
*/		
		
public class ValidMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2};
		if(isValid(arr)) {
			System.out.println("arr is Valid mountain array");
		}else {
			System.out.println("Otherwise");
		}
	}
	
	//Solution: O(n)
	public static boolean isValid(int[] a) {
		int N = a.length;
		int i = 0;
		
		//walk up
		while(i + 1 < N && a[i] < a[i+1]) {
			i++;
		}
		
		//peak can't be first or last
		if(i == 0 || i == N-1) return false;
		
		//walk down
		++i;
		while(i + 1 < N && a[i] > a[i+1]) {
			i++;
		}
		
		return i == N-1;
	}

}
