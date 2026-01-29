package Stream_API_AssignmentInteger;

import java.util.Arrays;
import java.util.List;

//Square every element and find sum
public class Square_Sum {
	public static void main(String[] args) {
		List<Integer> listInteger=Arrays.asList(2,4,6,8,10);
		int sum =listInteger.stream().map(n->n*n).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}
