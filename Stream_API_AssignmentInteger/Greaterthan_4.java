package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;

// From numbers(provided at top of doc),count how many numbers are greater than 4
public class Greaterthan_4 {
	public static void main(String[] args) {
		//given list
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 //Greater than 4
		 long l=numbers.stream()
		 .filter(condition->condition>4)
		 .count();
		 System.out.println("count is :"+l);;
		 }
	}


