package SET_Assinment;

import java.util.HashSet;
import java.util.Set;

public class Checks_Number {
	public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);

        boolean found = false;
        for(Integer i : set) {
            if(i == 10) {
                found = true;
            }
        }
        System.out.println(found);
    }
}
