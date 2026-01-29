package LIST_Assignment;

import java.util.ArrayList;
import java.util.List;

// Create a List<Integer> and count how many elements are divisible by 3 and 5both.
public class CountDivisibleBy3_5 {
public static void main(String[] args) {
	List<Integer> list =new ArrayList<>();
	list.add(15);
	list.add(30);
	list.add(10);
	 int count=0;
	 for(Integer i:list) {
		 if(i%3==0 && i%5==0) {
			 count++;
			 
		 }
	 }
	System.out.println(count);
	
}
}
