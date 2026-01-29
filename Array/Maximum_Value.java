package Array;

import java.util.Scanner;

public class Maximum_Value {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//input array size
	System.out.println("Enter number of element:");
	int n=sc.nextInt();
	int[] arr=new int[n];
	
	//input elements
	System.out.println("Enter "+n+" integers:");
	for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	}
	//Assume first element is maximum
	int max=arr[0];
	
	//compare with rest
	for(int i=1;i<arr.length;i++) {
		if(arr[i] >max) {
			max=arr[i];
		}
	}
	//print result
	System.out.println("Maximun value in the array:"+max);
	
	}

}
