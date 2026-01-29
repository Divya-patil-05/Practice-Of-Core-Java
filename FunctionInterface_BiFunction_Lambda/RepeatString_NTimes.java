package FunctionInterface_BiFunction_Lambda;

import java.util.function.BiFunction;

public class RepeatString_NTimes {
public static void main(String[] args) {
	BiFunction<String , Integer , String> repeatString=(text,count)->text.repeat(count);
	String repeated = repeatString.apply("Hello World  ", 7);
	System.out.print("Repeated String :"+repeated);
	
}
}
