package QBASSIGNMENT2IFELSE;

import java.util.Scanner;

public class OddDifferenceEvaluator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input 2 numbers
		System.out.println("Enter First Number");
		int number1=sc.nextInt();
		System.out.println("Enter Second Number");
	    int number2=sc.nextInt();
	    
	    if(number1 %2!=0 && number2 %2!=0) {
	    	int diff=Math.abs(number1-number2);
	    	System.out.println("Differnce is"+diff);
	    }else {
	    	System.out.println("Invalid");
	    }
	}

}
