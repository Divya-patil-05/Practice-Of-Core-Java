package For_Loop;

import java.util.Scanner;

public class ReverseTable {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int num=sc.nextInt();
	for(int i=10;i>=1;i--) {
		System.out.println(num+"x"+i+"="+(num*i));
		
	}
}
}
