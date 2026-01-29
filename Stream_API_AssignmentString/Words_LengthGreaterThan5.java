package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;

//Print words with length greater than 5
public class Words_LengthGreaterThan5 {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		words.stream().filter(w->w.length()>5).forEach(System.out::println);
	}

}
