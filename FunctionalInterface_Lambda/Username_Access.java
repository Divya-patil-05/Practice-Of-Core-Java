package FunctionalInterface_Lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Username_Access {
public static void main(String[] args) {
	Supplier<String> Supplier=()->"admin123";
	Predicate<String> predicate=name->name.startsWith("admin");
	
	if(predicate.test(Supplier.get())) {
		System.out.println("Access G");
	}
}
}
