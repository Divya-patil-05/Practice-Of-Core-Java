package Array;

import java.util.Scanner;

public class Minimum_value {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	//input array size
	System.err.println("Enter all Numbers:");
	int n=sc.nextInt();
	int[]arr=new int[n];
	
//Input Elements
System.out.println("Enter "+n+" Number");
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
//assume 1st element is max
int min=arr[0];
//compare with rest
for(int i=1;i<arr.length;i++) {
	if(arr[i] <min) {
		min=arr[i];
	}
}
//print result
	System.out.println("Minimum value in the array:"+min);
	
	}
}


