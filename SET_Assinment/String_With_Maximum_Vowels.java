package SET_Assinment;

import java.util.HashSet;
import java.util.Set;

public class String_With_Maximum_Vowels {
	public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("education");

        String result = "";
        int max = 0;

        for(String s : set) {
            int count = 0;
            for(char c : s.toCharArray()) {
                if("aeiou".indexOf(c) != -1) count++;
            }
            if(count > max) {
                max = count;
                result = s;
            }
        }
        System.out.println(result);
    }
}
