package Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Fundamental {
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//forEach: iterate each element of stream
//		Random random = new Random();
//		random.ints().limit(3).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,4);
		
		//get list of unique squares
		List<Integer> square = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
		
		String[] str = {"","ab","bb"};
		List<String> arrList = Arrays.asList(str);
		
		int count = (int) (arrList.stream().filter(s -> s.isEmpty()).count());
		System.out.println("Amount of empty elements: "+count);
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		long count1 = strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println(count1);
		
		
		//Collectors: return List or String
		List<String> string = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		List<String> listStr = string.stream().filter(s-> !s.isEmpty()).collect(Collectors.toList());
		System.out.println("List: "+listStr);
		
		String mergerString = string.stream().filter(s->!s.isEmpty()).collect(Collectors.joining("-"));
		System.out.println(mergerString);
	}

}
