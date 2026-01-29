package SET_Assinment;

import java.util.HashSet;
import java.util.Set;

public class Count_EvenNo_Set {
	 public static void main(String[] args) {

	        Set<Integer> set = new HashSet<>();
	        set.add(2);
	        set.add(3);
	        set.add(4);

	        int count = 0;
	        for(Integer i : set) {
	            if(i % 2 == 0) count++;
	        }
	        System.out.println(count);
	    }
}
