package DO_While_Loop;

import java.util.Scanner;

public class SumOfEven_Numbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(), i=2,sum=0;
	do {
		sum +=i;
		i+=2;
	}while(i<=n);
	System.out.println(sum);
}
}
