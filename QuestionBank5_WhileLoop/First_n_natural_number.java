package QuestionBank5_WhileLoop;

import java.util.Scanner;

public class First_n_natural_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Natural Number:");
		int num=sc.nextInt();
		
		int a=1;
		while(a<=num) {
			System.out.println(num);
			a++;
		}
		
		
	}

}
