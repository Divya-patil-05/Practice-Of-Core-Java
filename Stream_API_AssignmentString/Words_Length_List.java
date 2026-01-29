package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Map each word to its length
public class Words_Length_List {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		List<Integer> result=words.stream().map(String::length).collect(Collectors.toList());
		System.out.println(result);
	}

}
