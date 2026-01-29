package QBASSIGNMENT2IFELSE;

import java.util.Scanner;

public class BiggestAmongThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a:");
		int a=sc.nextInt();
		System.out.println("Enter Value of b:");
		int b=sc.nextInt();
		System.out.println("Enter Value of c:");
		int c=sc.nextInt();
		if(a>b) {
	      if(a>c) {
	    	  System.out.println("c is Greatest Number:"+a);
	      }
	      System.out.println("a is Greatest Number:"+a);
		}
		
	if(b>c) {
		System.out.println("b is Greatest Number:"+b);
	}
	else {
		System.out.println("it is greatest number"+c);
	}
	}

}
