package QBASSIGNMENT2IFELSE;

import java.util.Scanner;

public class AgeCategoryChecker {
	public static void main(String[] args) {
		//Input age
		Scanner sc= new Scanner(System.in) ;
		int age=sc.nextInt();
		
		System.out.println("Enter Age :");
		//Categorize
		if(0>=12) {
			System.out.println("Child");
		}
		else if(13>=17) {
			System.out.println("Teen");
		}
		else if(18>=59) {
			System.out.println("Adult");
		}
		else if(60>=100) {
			System.out.println("Senior");
		}
		else {
			System.out.println("Invalid Details");
		}
		
	}//method

}//class
