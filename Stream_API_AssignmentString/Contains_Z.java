package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;

//Check if any word contains 'z'
public class Contains_Z {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		boolean result=words.stream().anyMatch(w->w.contains("z"));
		System.out.println(result);
	}

}
