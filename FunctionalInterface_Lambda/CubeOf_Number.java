package FunctionalInterface_Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CubeOf_Number {
public static void main(String[] args) {
	Supplier<Integer> supplier =()->3;
	Function<Integer,Integer> cube =n ->n*n*n;
	
	Consumer<Integer> consumer= result -> System.out.println("Cube :"+result);
	consumer.accept(cube.apply(supplier.get()));
}
}
