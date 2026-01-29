package QuestionBank5_WhileLoop;

import java.util.Scanner;

public class Sum_Of_Digits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=sc.nextInt();
		
		int b=0;
		while(a>0) {
			int c= a %10;
			b =b +c;
			a =a/10;
		}
		System.out.println(b);
			
		}
		
	
	}


