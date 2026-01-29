package FunctionInterface_BiFunction_Lambda;

import java.util.function.BiFunction;

public class ToFind_LengthOfTwoStrings {
public static void main(String[] args) {
	BiFunction<String,String,Integer> totalLength =(s1,s2)->s1.length()+s2.length();
	int length=totalLength.apply("Divya", "Radhika");
	System.out.println("Total Length:"+length);
}
}
