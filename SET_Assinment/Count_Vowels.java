package SET_Assinment;

import java.util.HashSet;
import java.util.Set;

public class Count_Vowels {
	public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");

        int count = 0;
        for(String s : set) {
            for(char c : s.toCharArray()) {
                if("aeiou".indexOf(c) != -1) {
                    count++;
                }
            }
        }
        System.out.println(count);
}
}
