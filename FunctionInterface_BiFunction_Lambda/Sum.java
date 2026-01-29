package FunctionInterface_BiFunction_Lambda;

import java.util.function.BiFunction;

public class Sum {
	public static void main(String[] args) {
		
	
BiFunction<Integer ,Integer,Integer> addNumbers=(a,b)->a+b;
int sum =addNumbers.apply(6, 8);
System.out.println("Sum :"+sum);
}
}
