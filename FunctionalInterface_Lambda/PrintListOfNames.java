package FunctionalInterface_Lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PrintListOfNames {
public static void main(String[] args) {
	Supplier<List> supplier=()->List.of("Divya","Vrushabh","Smita","Radha");
	Consumer<List<String>> consumer=list->{
		for(String name: list) {
			System.out.println(name);
		}
	};
	consumer.accept(supplier.get());
}
}
