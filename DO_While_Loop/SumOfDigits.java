package DO_While_Loop;

import java.util.Scanner;

public class SumOfDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt(),sum=0;
	do {
		sum+=num%10;
		num/=10;
		
	}while(num!=0);
	System.out.println(sum);
}
}
