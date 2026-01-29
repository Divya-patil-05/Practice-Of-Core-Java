package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort words in reverse alphabetical order
public class Reverse_Alphabetical {
public static void main(String[] args) {
	List<String> words=Arrays.asList("apple","banana","mango","orange",
            "grape","kiwi","melon","apple","mango");
	List<String> result =words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	 System.out.println(result);
}
}
