package QBASSIGNMENT2IFELSE;

import java.util.Scanner;

public class Triangle_Validity {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//Input Angles
		System.out.println("Enter Angle 1:");
		int angle1=input.nextInt();
		
		System.out.println("Enter Angle 2:");
		int angle2= input.nextInt();
		
		System.out.println("Enter Angle 3:");
		int angle3=input.nextInt();
		
		//check validityy
		if(angle1>0 && angle2>0 && angle3>0 && (angle1+angle2+angle3==180)) {
		
          System.out.println("Valid Triangle");
		} else {
        	  System.out.println("Invalid Triangle");
          }//else
		}//if

}//method
//class
