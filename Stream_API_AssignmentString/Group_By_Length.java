package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group words by length
public class Group_By_Length {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		Map<Integer,List<String>> result=words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(result);
	}

}
