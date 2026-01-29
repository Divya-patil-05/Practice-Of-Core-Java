package LIST_Assignment;

import java.util.ArrayList;
import java.util.List;

//Create a List<String> with names and print only those names which start with the Letter 'A'.
public class Names_Start_With_A {
public static void main(String[] args) {
	List<String> names=new ArrayList<>();
	names.add("Amit");
	names.add("Aditi");
	names.add("Divya");
	names.add("Raghv");
	names.add("ISHA");
	names.add("Arun");
	
	for(String name:names) {
		if(name.startsWith("A")) {
			System.out.println(name);
		}
		
	}
	
}
}
