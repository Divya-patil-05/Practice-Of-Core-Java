package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get first 3 elements
public class First_Three_Words {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		List<String> result=words.stream().limit(3).collect(Collectors.toList());
		System.out.println(result);
	}

}
