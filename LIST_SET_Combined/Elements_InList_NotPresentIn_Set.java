package LIST_SET_Combined;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Elements_InList_NotPresentIn_Set {
	 public static void main(String[] args) {

	        List<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);

	        Set<Integer> set = new HashSet<>();
	        set.add(2);

	        for(Integer i : list) {
	            if(!set.contains(i)) {
	                System.out.println(i);
	            }
	        }
	    }
}
