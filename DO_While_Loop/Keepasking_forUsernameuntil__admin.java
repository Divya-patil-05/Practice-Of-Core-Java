package DO_While_Loop;

import java.util.Scanner;

public class Keepasking_forUsernameuntil__admin {
public static void main(String[] args) {
	Scanner sc=new Scanner
			(System.in);
	String username;
	do {
		System.out.println("Enter Username");
		username=sc.nextLine();
		
	}while(!username.equals("admin"));
	System.out.println("Login Successful");
}
}
