package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;

//Count words with length exactly 5
public class Count_Length_Five {
	public static void main(String[] args) {
		List<String> words =Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		long count=words.stream().filter(w->w.length()==5).count();
		System.out.println(count);
	}

}
