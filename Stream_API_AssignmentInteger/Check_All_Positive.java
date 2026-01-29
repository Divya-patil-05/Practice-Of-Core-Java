package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;

//Check if all numbers are positive
public class Check_All_Positive {
public static void main(String[] args) {
	List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	boolean result = numbers.stream().allMatch(n->n>0);
	System.out.println(result);
}
}
