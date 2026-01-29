package LIST_SET_Combined;

import java.util.HashSet;
import java.util.Set;

public class Colors_to_uppercase {
	public static void main(String[] args) {

        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("blue");

        Set<String> upperColors = new HashSet<>();

        for(String c : colors) {
            upperColors.add(c.toUpperCase());
        }

        System.out.println("Original: " + colors);
        System.out.println("Uppercase: " + upperColors);
    }
}
