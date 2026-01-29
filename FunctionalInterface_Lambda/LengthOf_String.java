package FunctionalInterface_Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LengthOf_String {
public static void main(String[] args) {
	Supplier<String> supplier =()->"Divya";
	Function<String, Integer> function =str->str.length();
	Consumer<Integer> consumer=len->System.out.println("Length is :"+len);
	
	String name = supplier.get();
	int length =function .apply(name);
	consumer.accept(length);

}
}
