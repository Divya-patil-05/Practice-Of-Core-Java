package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;

// From numbers(provided at top of doc),find the maximum[highest] number
public class HighestNumber {
public static void main(String[] args) {
	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	 //maximum number
	 numbers.stream().filter(condition->condition>10).forEach(x->System.out.println(x));
	 
}
}
