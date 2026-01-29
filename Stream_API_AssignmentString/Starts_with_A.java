package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;

//Print words starting with 'a'
public class Starts_with_A {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		words.stream().filter(w->w.startsWith("a")).forEach(System.out::println);
		
	}

}
