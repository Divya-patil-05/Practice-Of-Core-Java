package LIST_SET_Combined;

import java.util.ArrayList;
import java.util.List;

public class PrintOnly_FirstNames {
	public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John Doe");
        names.add("Ravi Kumar");

        for(String fullName : names) {
            String firstName = fullName.split(" ")[0];
            System.out.println(firstName);
        }
}
}
