package LIST_Assignment;

import java.util.ArrayList;
import java.util.List;

// Create a List<Integer> and find the maximum and minimum number usingenhanced for-loop.
public class Find_MaxMin {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(30);
		list.add(60);
		
		int max =list.get(0);
		int min =list.get(0);
		for(Integer i :list) {
			if(i>max) max=i;
			if(i<min) min=i;
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);

	}

}
