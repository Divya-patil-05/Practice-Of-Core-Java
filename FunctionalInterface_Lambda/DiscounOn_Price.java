package FunctionalInterface_Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DiscounOn_Price {
public static void main(String[] args) {
	Supplier<Double> supplier=()->135.80;
	Predicate<Double> predicate = price->price> 100;
	
	Function<Double, Double> discount = price ->price -(price*0.10);
	
	Consumer<Double> consumer = price -> System.out.println("Final Price:" +price);
	
	double price =supplier.get();
	if(predicate.test(price)) {
		price=discount.apply(price);
	}
	consumer.accept(price);
}
}
