package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;

//Count occurrences of apple
public class Count_Apple {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		long count=words.stream().filter(w->w.equals("apple")).count();
		System.out.println(count);
	}

}
