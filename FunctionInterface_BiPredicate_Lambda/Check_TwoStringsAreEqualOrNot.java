package FunctionInterface_BiPredicate_Lambda;

import java.util.function.BiPredicate;

public class Check_TwoStringsAreEqualOrNot {
public static void main(String[] args) {
	 // BiPredicate takes TWO inputs and returns boolean
	BiPredicate<String,String> stringEquals=(str1,str2)->str1.equalsIgnoreCase(str2);
	System.out.println("Strings Equal:"+stringEquals.test("DIVYA", "divya"));
}
}
