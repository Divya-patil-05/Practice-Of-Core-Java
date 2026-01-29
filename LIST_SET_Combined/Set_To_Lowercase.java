package LIST_SET_Combined;

import java.util.HashSet;
import java.util.Set;

public class Set_To_Lowercase {
	 public static void main(String[] args) {

	        Set<String> set = new HashSet<>();
	        set.add("JAVA");
	        set.add("CODE");

	        Set<String> lowerSet = new HashSet<>();

	        for(String s : set) {
	            lowerSet.add(s.toLowerCase());
	        }

	        System.out.println(lowerSet);
	    }
}
