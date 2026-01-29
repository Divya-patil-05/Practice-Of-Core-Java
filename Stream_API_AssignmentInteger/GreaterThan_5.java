package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;

// From numbers(provided at top of doc),Print all numbers greater than 5
public class GreaterThan_5 {
public static void main(String[] args) {
	//Given List
	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	 //Greater than 5
	 numbers.stream()
	 .filter(condition->condition>5)
	 .forEach(x->System.out.println(x));
}
}
