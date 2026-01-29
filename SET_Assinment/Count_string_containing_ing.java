package SET_Assinment;

import java.util.HashSet;
import java.util.Set;

public class Count_string_containing_ing {
	public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("playing");
        set.add("run");

        int count = 0;
        for(String s : set) {
            if(s.contains("ing")) count++;
        }
        System.out.println(count);
    }
}


