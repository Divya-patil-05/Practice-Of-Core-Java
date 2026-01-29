package FunctionalInterface_Lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Voting_Eligibility {
public static void main(String[] args) {
	Supplier<Integer> supplier =()->20;
	Predicate<Integer> predicate =age-> age >=18;
	
	int age =supplier.get();
	if(predicate.test(age)) {
		System.out.println("Eligible");
	}else {
		System.out.println("Not Eligible");
	}
	
}
}
