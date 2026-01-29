package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find longest word
public class Longest_Word {
	public static void main(String[] args) {
		List<String> words =Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		String result=words.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(result);
	}

}
