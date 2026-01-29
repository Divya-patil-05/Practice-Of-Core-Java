package FunctionalInterface_Lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PositiveNumber_Check {
public static void main(String[] args) {
	//Supplies a number
	Supplier<Integer> supplier = ()->10;
	
	//Check if number is positive
	Predicate<Integer> predicate =num->num>0;
	
	//prints message
	Consumer<String> consumer =msg->System.out.println(msg);
	
	int number=supplier.get();
	if(predicate.test(number)) {
		consumer.accept("Positive Number");
	}
	
}
}
