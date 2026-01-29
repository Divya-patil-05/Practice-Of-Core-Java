package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Remove duplicate words
public class Remove_Duplicates {
public static void main(String[] args) {
	List<String> words =Arrays.asList("apple","banana","mango","orange",
            "grape","kiwi","melon","apple","mango");
	List<String> result= words.stream().distinct().collect(Collectors.toList());
	System.out.println(result);
}
}
