package FunctionalInterface_Lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Name_StartWithA {
public static void main(String[] args) {
	Supplier<String> supplier =()->"Anita";
	Predicate<String> predicate=name-> name.startsWith("A");
	
	if(predicate.test(supplier.get())) {
		System.out.println("Name Accepted");
	}
}
}
