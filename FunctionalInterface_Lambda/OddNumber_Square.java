package FunctionalInterface_Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OddNumber_Square {
public static void main(String[] args) {
	Supplier<Integer> supplier=()->5;
	Predicate<Integer> isOdd=n->n%2!=0;
	Function<Integer,Integer> square=n->n*n;
	Consumer<Integer> consumer=result-> System.out.println("Square:"+result);
	int num=supplier.get();
	if(isOdd.test(num)) {
		consumer.accept(square.apply(num));
	}
}
}
