package QBASSIGNMENT2IFELSE;

import java.util.Scanner;

public class Leap_Year_Checker {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		//input a year
		System.out.println("Enter a Year:");
		int a= input.nextInt();
		
	//Check if its leap year
		if(a%4==0) {
			if(a%100==400) {
			
			System.out.println("It is Leap Year");
		}
			else {
				System.out.println("It is a leap year");
			}
		}else {
				System.out.println("It is Not a Leap Year");
			}
		}
	}


