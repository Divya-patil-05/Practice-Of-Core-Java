package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;

//Check if any number is divisible by 7
public class Divisible_By_Seven {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,14,12,21);
	boolean result=numbers.stream().anyMatch(n->n%7==0);
	System.out.println(result);
	}

}
