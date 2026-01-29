package DO_While_Loop;

import java.util.Scanner;

public class MaximumDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt(),max=0;
	do {
		int d=num%10;
		if(d>max)max=d;
		num/=10;
		
	}while(num!=0);
}
}
