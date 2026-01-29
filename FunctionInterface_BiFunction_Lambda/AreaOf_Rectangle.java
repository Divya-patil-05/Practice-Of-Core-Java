package FunctionInterface_BiFunction_Lambda;

import java.util.function.BiFunction;

public class AreaOf_Rectangle {
public static void main(String[] args) {
	BiFunction<Double ,Double ,Double> rectangleArea=(length,breadth)->length*breadth;
	double area=rectangleArea.apply(7.3, 2.3);
	System.out.println("Area of Rectangle:"+area);
}
}
