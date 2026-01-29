package Stream_API_AssignmentString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Skip first 3 elements
public class Skip_First_Three {
	public static void main(String[] args) {

        List<String> words = Arrays.asList(
            "apple","banana","mango","orange",
            "grape","kiwi","melon","apple","mango"
        );

        List<String> result = words.stream()
                                   .skip(3)
                                   .collect(Collectors.toList());

        System.out.println(result);
    }
}

