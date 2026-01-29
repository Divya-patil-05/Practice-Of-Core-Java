package FunctionalInterface_Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class UpperCase_Conversion {
public static void main(String[] args) {
	Supplier<String> supplier =()->"divya";
	Function<String ,String> upper= str->str.toUpperCase();
	
	Consumer<String> consumer = result->System.out.println(result);
	
	consumer.accept(upper.apply(supplier.get()));
	
}
}
