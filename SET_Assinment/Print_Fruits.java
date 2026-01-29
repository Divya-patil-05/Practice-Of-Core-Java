package SET_Assinment;

import java.util.HashSet;
import java.util.Set;

public class Print_Fruits {
	public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");

        for(String f : fruits) {
            System.out.println(f);
        }
}
}
