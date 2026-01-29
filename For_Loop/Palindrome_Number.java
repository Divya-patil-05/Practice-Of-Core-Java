package For_Loop;

import java.util.Scanner;

public class Palindrome_Number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp=num,rev = 0;
	for(;temp!=0;temp/=10) {
		rev= rev *10+temp%10;
		 }
	if(num==rev)
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
}

}

