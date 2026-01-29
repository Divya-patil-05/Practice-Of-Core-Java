package FunctionInterface_BiConsumer_Lambda;

import java.util.function.BiConsumer;

public class NameAndAge {
public static void main(String[] args) {
	BiConsumer<String , Integer> consumer=(name,age)->System.out.println("Name:"+name+", Age:"+age);
	consumer.accept("Divya",21);
	
}
}
