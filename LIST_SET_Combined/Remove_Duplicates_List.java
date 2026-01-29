package LIST_SET_Combined;

import java.util.ArrayList;
import java.util.List;

public class Remove_Duplicates_List {
	public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");

        List<String> unique = new ArrayList<>();

        for(String s : list) {
            if(!unique.contains(s)) {
                unique.add(s);
            }
        }

        System.out.println(unique);
    }
}
