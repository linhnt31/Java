package BaiTap_Hay;

import java.util.ArrayList;

//Description:
/*For an integer k rearrange all the elements of the given array in such way, that:

all elements that are less than k are placed before elements that are not less than k;
all elements that are less than k remain in the same order with respect to each other;
all elements that are not less than k remain in the same order with respect to each other.
Example

For k = 5 and elements = [1, 3, 5, 7, 6, 4, 2], the output should be
splitByValue(k, elements) = [1, 3, 4, 2, 5, 7, 6].
*/

public class splitByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Key
	public static int[] splitByValue(int k, ArrayList<Integer> elements) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i) < k) {
				result.add(elements.get(i));
			}
		}
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i) >= k) {
				result.add(elements.get(i));
			}
		}
		return result.stream().mapToInt(e -> e).toArray();
	}

}
