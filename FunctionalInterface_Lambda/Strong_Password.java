package FunctionalInterface_Lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Strong_Password {
public static void main(String[] args) {
	 Supplier<String> supplier=()->"Divya@123";
	Predicate<String> predicate=pass->pass.length()>=8;
	
	if(predicate.test(supplier.get())){
	   System.out.println("Strong Password");	
	}
}
}
