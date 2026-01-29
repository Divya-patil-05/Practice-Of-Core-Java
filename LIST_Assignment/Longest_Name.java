package LIST_Assignment;

import java.util.ArrayList;
import java.util.List;

// Create a List<String> of names and print the name with the longest length
public class Longest_Name {
public static void main(String[] args) {
	List<String> names=new ArrayList<>();
	names.add("Divya");
	names.add("Isha");
	names.add("Priyanka");
	
	String longest="";
	for(String name:names) {
		if(name.length()>longest.length()) {
			longest=name;
		}
	}
  System.out.println(longest);
}
}
