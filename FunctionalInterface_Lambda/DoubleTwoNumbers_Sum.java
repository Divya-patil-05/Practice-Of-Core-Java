package FunctionalInterface_Lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class DoubleTwoNumbers_Sum {
public static void main(String[] args) {
	Supplier<Integer> s1=()->10;
	Supplier<Integer> s2=()->20;
	
	Function<Integer,Integer> doublen=n->n*2;
	int sum=doublen.apply(s1.get())+doublen.apply(s2.get());
	System.out.println("Sum:"+sum);
}
}
