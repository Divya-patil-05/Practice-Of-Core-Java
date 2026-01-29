package LIST_SET_Combined;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_To_Set {
	public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();

        for(Integer i : list) {
            set.add(i);
        }

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
    }
}
