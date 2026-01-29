package Stream_API_AssignmentString;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Sort words alphabetically
public class Sort_Alphabetically {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","mango","orange",
	            "grape","kiwi","melon","apple","mango");
		List<String> result=words.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
	}

}
