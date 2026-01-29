package FunctionInterface_BiConsumer_Lambda;

import java.util.function.BiConsumer;

public class AllArithmetic_Operation {
public static void main(String[] args) {
	BiConsumer<Integer,Integer> arithmeticOperation=(a,b)->{
	
	
 System.out.println("Addition: " + (a + b));
                    System.out.println("Subtraction: " + (a - b));
                    System.out.println("Multiplication: " + (a * b));
                    System.out.println("Division: " + (a / b));
                };
                arithmeticOperation.accept(10,5);
}
}
