package Array;

public class Sort_Descending {
public static void main(String[] args) {
	int[] arr= {4,5,6,8,9,6,6,5,4};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int t=arr[i];arr[i]=arr[j];arr[j]=t;
			}
		}
	}
	for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
}
}
