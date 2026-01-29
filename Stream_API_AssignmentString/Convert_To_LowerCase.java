package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert all words to lowercase
public class Convert_To_LowerCase {
public static void main(String[] args) {
	List<String> words=Arrays.asList("apple","banana","mango","orange",
            "grape","kiwi","melon","apple","mango");
	List<String> result =words.stream().map(String::toLowerCase).collect(Collectors.toList());
	System.out.println(result);
}
}
