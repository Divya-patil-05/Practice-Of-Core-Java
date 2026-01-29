package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort numbers in reverse order
public class Reverse_Sort {
public static void main(String[] args) {
	List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List<Integer> result = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(result);
}
}
