package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrList = Arrays.asList(1,2,3,4,5); 
		
		int[] a = arrList.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(a));
	}

}
