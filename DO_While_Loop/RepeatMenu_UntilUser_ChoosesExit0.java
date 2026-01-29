package DO_While_Loop;

import java.util.Scanner;

public class RepeatMenu_UntilUser_ChoosesExit0 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice =0;
	do {
		System.out.println("1.Add");
		System.out.println("2.Substract");
		System.out.println("0.Exit");
		System.out.println("Enter Choices: ");
	}while(choice !=0);
	System.out.println("Exited menu");
}
}
