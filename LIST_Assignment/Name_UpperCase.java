package LIST_Assignment;

import java.util.ArrayList;
import java.util.List;

//Create a List<String> of names and print all names in uppercase using enhancedfor-loop.
public class Name_UpperCase {
public static void main(String[] args) {
List<String> names=new ArrayList<>();
names.add("divya");
names.add("riya");
names.add("jiya");

for(String name:names) {
	System.out.println(name.toUpperCase());
}
}
}
