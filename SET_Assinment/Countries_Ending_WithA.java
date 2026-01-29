package SET_Assinment;

import java.util.HashSet;
import java.util.Set;

public class Countries_Ending_WithA {
	 public static void main(String[] args) {

	        Set<String> countries = new HashSet<>();
	        countries.add("India");
	        countries.add("USA");

	        for(String c : countries) {
	            if(c.endsWith("a")) {
	                System.out.println(c);
	            }
	        }
	 }
}
