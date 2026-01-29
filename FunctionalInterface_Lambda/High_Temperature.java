package FunctionalInterface_Lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class High_Temperature {
public static void main(String[] args) {
	Supplier<Double> supplier =()->38.8;
	Predicate<Double> predicate=temp->temp>37.5;
	if(predicate.test(supplier.get())) {
		System.out.println("High Temperature");
	}
}
}
