package DO_While_Loop;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt(),rev=0;
	do {
		rev=rev*10+num%10;
		num/=10;
		
	}while(num!=0);
	System.out.println(rev);
}
}
