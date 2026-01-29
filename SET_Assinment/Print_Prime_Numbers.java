package SET_Assinment;

import java.util.HashSet;
import java.util.Set;

public class Print_Prime_Numbers {
	public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(5);

        for(Integer n : set) {
            boolean prime = true;
            if(n <= 1) prime = false;

            for(int i = 2; i <= n / 2; i++) {
                if(n % i == 0) prime = false;
            }

            if(prime) System.out.println(n);
        }
}
}
