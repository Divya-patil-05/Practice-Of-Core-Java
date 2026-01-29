package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert Integer list to String list
public class Integer_To_String {
	public static void main(String[] args) {
		List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<String> result=numbers.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println(result);
	}

}
