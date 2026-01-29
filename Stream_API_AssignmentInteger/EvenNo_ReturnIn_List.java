package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// From list of integers extract even number and return them in list
public class EvenNo_ReturnIn_List {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//extract even number
		List<Integer> a = numbers.stream()
		.filter(condition->condition%2==0)
		.collect(Collectors.toList());
		System.out.println(a);
	}

}
