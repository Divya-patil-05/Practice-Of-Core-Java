package DO_While_Loop;

import java.util.Scanner;

public class Fcatorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),fact=1;
		do {
			fact*=n;
			n--;
			
		}while(n>0);
		System.out.println(fact);
	}

}
