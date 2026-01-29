package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find shortest word
public class Shortest_word {
	public static void main(String[] args) {
		List<String> word =Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		String result= word.stream().min(Comparator.comparingInt(String::length)).get();
		System.out.println(result);
	}

}
