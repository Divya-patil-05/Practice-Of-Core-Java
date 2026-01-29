package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;

//From list of integers extract even number and print them on console
public class Extract_EvenNo {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	//Extract Even numbers
	numbers.stream()   //stream
	.filter(condition->condition%2==0)    //%2==o(Even No)   //intermediateOperator
	.forEach(x->System.out.println(x));   //for each         //terminalOperator
}
}
