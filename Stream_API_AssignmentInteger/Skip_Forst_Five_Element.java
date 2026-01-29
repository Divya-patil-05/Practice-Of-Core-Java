package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Skip first 5 elements
public class Skip_Forst_Five_Element {
public static void main(String[] args) {
	List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List<Integer> result = numbers.stream().skip(5).collect(Collectors.toList());
	System.out.println(result);
	
		
	}

}
