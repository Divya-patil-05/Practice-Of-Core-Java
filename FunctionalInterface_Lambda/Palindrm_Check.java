package FunctionalInterface_Lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Palindrm_Check {
public static void main(String[] args) {
	Supplier<String> supplier =()->"madam";
	Predicate<String> palindrome=str->str.equals(new StringBuilder(str).reverse().toString());
	Consumer<Boolean> consumer=result->System.out.println("Palindrome:"+result);
	
	consumer.accept(palindrome.test(supplier.get()));
}
}
