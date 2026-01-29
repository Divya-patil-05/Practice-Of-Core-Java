package LIST_SET_Combined;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Elements_Present_in_SET_LIST {
	public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("C++");

        for(String s : list) {
            if(set.contains(s)) {
                System.out.println(s);
            }
        }
    }
}
