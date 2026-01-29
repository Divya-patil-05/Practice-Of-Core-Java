package DO_While_Loop;

import java.util.Scanner;

public class Square_Cubes_fromN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		
		int a=1;
		do
		{
			System.out.println(a*a);
			a++;
		}while(a<=num);
		System.out.println("*********CUBE NUMBERS******");
	   
		int b=1;
		do {
			System.out.println(b*b*b);
			b++;
		}while(b<=num);	
		
	}

}
