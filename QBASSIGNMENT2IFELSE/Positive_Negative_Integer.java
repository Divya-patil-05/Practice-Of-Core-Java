package QBASSIGNMENT2IFELSE;

import java.util.Scanner;

public class Positive_Negative_Integer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a= sc.nextInt();
		//Check it is positive negavtive or zero
		
		
		
		if(a>0 ) {
			System.out.println("It Is Positive Integer");
			if(a<0) {
				System.out.println("It Is Negative Integer");
				if(a==0) {
					System.out.println("Zero");
				}else {
						System.out.println("Invalid Integer");
					}
				}
			}
		}
	}


