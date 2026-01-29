package DO_While_Loop;

import java.util.Scanner;

public class ProdectOfDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt(),prod=1;
	do {
		prod*=num%10;
		num/=10;
		
	}while(num!=0);
	System.out.println(prod);
}
}
