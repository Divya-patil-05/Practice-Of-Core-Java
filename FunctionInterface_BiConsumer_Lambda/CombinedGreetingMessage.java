package FunctionInterface_BiConsumer_Lambda;

import java.util.function.BiConsumer;

public class CombinedGreetingMessage {
public static void main(String[] args) {
	BiConsumer<String,String> greeting=(name1,name2)->System.out.println("Hello "+name1 +" and "+name2);
	greeting.accept("Divya", "Isha");
}
}
