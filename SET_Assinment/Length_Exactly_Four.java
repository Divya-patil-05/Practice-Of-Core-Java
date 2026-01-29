package SET_Assinment;

import java.util.HashSet;
import java.util.Set;

public class Length_Exactly_Four {
	public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Code");

        for(String s : set) {
            if(s.length() == 4) {
                System.out.println(s);
            }
}
}
}