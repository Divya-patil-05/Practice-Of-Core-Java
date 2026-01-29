package FunctionInterface_BiPredicate_Lambda;

import java.util.function.BiPredicate;

public class Check1stNumber_Divisibleby_Second {
public static void main(String[] args) {
	BiPredicate<Integer , Integer> divisibleCheck=(num1,num2)->num1%num2==0;
	System.out.println("Divisible:"+divisibleCheck.test(15, 3));
}
}
