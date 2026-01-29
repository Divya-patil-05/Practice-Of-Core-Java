package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;

//Print all words
public class Print_All_Words {
	public static void main(String[] args) {
		List<String> words =Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		words.stream().forEach(System.out::println);
	}

}
