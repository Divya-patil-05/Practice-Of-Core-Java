package QuestionBank5_WhileLoop;

import java.util.Scanner;

public class Count_NumberOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=sc.nextInt();
		int b=1;
		while(a>=b) {
			System.out.println(a);
			b++;
		}
	}

}
