package LIST_Assignment;

import java.util.ArrayList;
import java.util.List;

public class Count_Long_Nmaes {
public static void main(String[] args) {
	List<String> names=new ArrayList<>();
	names.add("Radhika");
	names.add("Madhvi");
	names.add("Divya");
	names.add("Sanika");
	
	int count=0;
	for(String name:names) {
		if(name.length()>5) {
			count++;
			
		}
	}

	System.out.println(count);
}
}
