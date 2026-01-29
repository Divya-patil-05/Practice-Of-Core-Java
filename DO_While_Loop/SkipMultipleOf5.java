package DO_While_Loop;

import java.util.Scanner;

public class SkipMultipleOf5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
	
	do {
		if(i%5!=0)
			System.out.println(i);
		
		i++;
		}while(i<=n);
	
}
}
