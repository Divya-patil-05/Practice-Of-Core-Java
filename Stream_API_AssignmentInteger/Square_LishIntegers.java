package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Square each element and return list
public class Square_LishIntegers {
public static void main(String[] args) {
	List<Integer> listInteger=Arrays.asList(2,4,6,8,10);
	
	List<Integer> result=listInteger.stream().map(n->n*n).collect(Collectors.toList());
    System.out.println(result);
}
}
