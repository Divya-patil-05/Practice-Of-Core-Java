package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Join words using comma
public class Join_Words {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		String result=words.stream().collect(Collectors.joining(","));
		System.out.println(result);
	}

}
