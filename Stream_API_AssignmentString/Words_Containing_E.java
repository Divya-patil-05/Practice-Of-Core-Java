package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter words containing letter 'e'
public class Words_Containing_E {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		List<String> result=words.stream().filter(w->w.contains("e")).collect(Collectors.toList());
		System.out.println(result);
	}

}
