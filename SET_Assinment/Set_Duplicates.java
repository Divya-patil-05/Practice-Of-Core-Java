package SET_Assinment;

import java.util.HashSet;
import java.util.Set;

// Add 10 integers to a Set<Integer> (include some duplicates). Print the set toobserve how duplicates are handled.
public class Set_Duplicates {
public static void main(String[] args) {
	Set<Integer>set=new HashSet<>();
	set.add(1);
	set.add(2);
	set.add(2);
	set.add(3);
	
	System.out.println(set);

	
}
}
