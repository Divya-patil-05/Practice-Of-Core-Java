package Array;

public class Swap_First$Last {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	int t=arr[0];arr[0]=arr[arr.length-1]; arr[arr.length-1]=t;
	for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
}
}
