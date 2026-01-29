package DO_While_Loop;

import java.util.Scanner;

public class numbersFrom1toN_skips5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		
		int a=1;
		do {
			if(a%5!=0) {
				System.out.println(a);
			}
			a++;
		}while(a<=num);
	}

}
