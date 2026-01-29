package LIST_SET_Combined;

import java.util.ArrayList;
import java.util.List;

public class Remove_elements_with_length_lessthan4 {
	 public static void main(String[] args) {

	        List<String> list = new ArrayList<>();
	        list.add("Java");
	        list.add("C");
	        list.add("Code");

	        List<String> result = new ArrayList<>();

	        for(String s : list) {
	            if(s.length() >= 4) {
	                result.add(s);
	            }
	        }

	        System.out.println(result);
	    }
	}
