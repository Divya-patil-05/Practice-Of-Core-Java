package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;

// Check all words have more than 3 letters
public class Length_Greater_Than_Three {
	public static void main(String[] args) {
		List<String> words =Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		boolean result =words.stream().allMatch(w->w.length()>3);
		System.out.println(result);
	}

}
