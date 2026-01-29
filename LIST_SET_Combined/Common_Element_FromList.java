package LIST_SET_Combined;

import java.util.ArrayList;
import java.util.List;

public class Common_Element_FromList {
	public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");
        list2.add("D");

        for(String s : list1) {
            if(list2.contains(s)) {
                System.out.println(s);
            }
        }
	}
}
