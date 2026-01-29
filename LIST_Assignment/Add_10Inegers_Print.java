package LIST_Assignment;

import java.util.ArrayList;
import java.util.List;

// Add 10 integers to a List<Integer> and print all elements using enhanced for-loop.
public class Add_10Inegers_Print {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	list.add(10);
	
	for(Integer i:list) {
		System.out.println(i);
		
	}
	
}
}
