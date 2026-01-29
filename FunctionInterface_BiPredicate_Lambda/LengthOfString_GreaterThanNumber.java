package FunctionInterface_BiPredicate_Lambda;

import java.util.function.BiPredicate;

public class LengthOfString_GreaterThanNumber {
public static void main(String[] args) {
	BiPredicate<String , Integer> lengthCheck=(text,number)->text.length()>number;
	System.out.println("Length Greater:"+lengthCheck.test("Divya", 5));
}
}
