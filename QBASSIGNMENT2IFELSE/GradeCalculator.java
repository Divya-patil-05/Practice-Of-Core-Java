package QBASSIGNMENT2IFELSE;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		//input marks(0-100)
		Scanner sc = new Scanner(System.in);
		//input marks
		System.out.println("Enter marks(0 -100):");
		int marks=sc.nextInt();
		//Grades to print
		if(marks>=90) {
			System.out.println("A Grades");
		}
		else if(marks>=80) {
			System.out.println("B Grades");
		}
		else if(marks>=70) {
			System.out.println("C Grades");
		}
		else if(marks>=60) {
			System.out.println("D Grades");
		}
		else if(marks<=50) {
			System.out.println("Fail");
		}
	}
}

