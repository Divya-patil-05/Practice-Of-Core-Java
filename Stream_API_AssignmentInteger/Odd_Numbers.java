package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;

// count odd integers from list of integer
public class Odd_Numbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream()
        .filter(condition->condition%2==1)    //%2==1(Odd No)   //intermediateOperator
    	.forEach(x->System.out.println(x));   //for each         //terminalOperator
	}
	}
   

